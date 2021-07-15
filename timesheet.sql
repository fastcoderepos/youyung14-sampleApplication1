--
-- PostgreSQL database dump
--

-- Dumped from database version 10.10
-- Dumped by pg_dump version 10.10

-- Started on 2021-02-16 11:46:01

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

CREATE SCHEMA IF NOT EXISTS timesheet;

--
-- TOC entry 273 (class 1259 OID 332819)
-- Name: app_configuration_id_seq; Type: SEQUENCE; Schema: timesheet; Owner: postgres
--

CREATE SEQUENCE timesheet.app_configuration_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

ALTER TABLE timesheet.app_configuration_id_seq OWNER TO postgres;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 274 (class 1259 OID 332821)
-- Name: app_configuration; Type: TABLE; Schema: timesheet; Owner: postgres
--

CREATE TABLE timesheet.app_configuration (
    id bigint DEFAULT nextval('timesheet.app_configuration_id_seq'::regclass) NOT NULL,
    type character varying(255) NOT NULL,
    value character varying(255) NOT NULL
);

ALTER TABLE timesheet.app_configuration OWNER TO postgres;

--
-- TOC entry 256 (class 1259 OID 332690)
-- Name: customer; Type: TABLE; Schema: timesheet; Owner: postgres
--

CREATE TABLE timesheet.customer (
    customerid bigint NOT NULL,
    name character varying(255) NOT NULL,
    description character varying(255),
    isactive boolean NOT NULL
);

ALTER TABLE timesheet.customer OWNER TO postgres;

--
-- TOC entry 257 (class 1259 OID 332696)
-- Name: customer_customerid_seq; Type: SEQUENCE; Schema: timesheet; Owner: postgres
--

CREATE SEQUENCE timesheet.customer_customerid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE timesheet.customer_customerid_seq OWNER TO postgres;

--
-- TOC entry 3094 (class 0 OID 0)
-- Dependencies: 257
-- Name: customer_customerid_seq; Type: SEQUENCE OWNED BY; Schema: timesheet; Owner: postgres
--

ALTER SEQUENCE timesheet.customer_customerid_seq OWNED BY timesheet.customer.customerid;


--
-- TOC entry 258 (class 1259 OID 332698)
-- Name: project; Type: TABLE; Schema: timesheet; Owner: postgres
--

CREATE TABLE timesheet.project (
    id bigint NOT NULL,
    customerid bigint NOT NULL,
    name character varying(255) NOT NULL,
    description character varying(255),
    startdate date NOT NULL,
    enddate date NOT NULL
);


ALTER TABLE timesheet.project OWNER TO postgres;

--
-- TOC entry 259 (class 1259 OID 332704)
-- Name: project_id_seq; Type: SEQUENCE; Schema: timesheet; Owner: postgres
--

CREATE SEQUENCE timesheet.project_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE timesheet.project_id_seq OWNER TO postgres;

--
-- TOC entry 3095 (class 0 OID 0)
-- Dependencies: 259
-- Name: project_id_seq; Type: SEQUENCE OWNED BY; Schema: timesheet; Owner: postgres
--

ALTER SEQUENCE timesheet.project_id_seq OWNED BY timesheet.project.id;


--
-- TOC entry 260 (class 1259 OID 332706)
-- Name: task; Type: TABLE; Schema: timesheet; Owner: postgres
--

CREATE TABLE timesheet.task (
    id bigint NOT NULL,
    projectid bigint,
    name character varying(255) NOT NULL,
    description character varying(255),
    isactive boolean NOT NULL
);


ALTER TABLE timesheet.task OWNER TO postgres;

--
-- TOC entry 261 (class 1259 OID 332712)
-- Name: task_id_seq; Type: SEQUENCE; Schema: timesheet; Owner: postgres
--

CREATE SEQUENCE timesheet.task_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE timesheet.task_id_seq OWNER TO postgres;

--
-- TOC entry 3096 (class 0 OID 0)
-- Dependencies: 261
-- Name: task_id_seq; Type: SEQUENCE OWNED BY; Schema: timesheet; Owner: postgres
--

ALTER SEQUENCE timesheet.task_id_seq OWNED BY timesheet.task.id;


--
-- TOC entry 262 (class 1259 OID 332714)
-- Name: timeofftype; Type: TABLE; Schema: timesheet; Owner: postgres
--

CREATE TABLE timesheet.timeofftype (
    id bigint NOT NULL,
    typename character varying(255) NOT NULL
);


ALTER TABLE timesheet.timeofftype OWNER TO postgres;

--
-- TOC entry 263 (class 1259 OID 332717)
-- Name: timeofftype_id_seq; Type: SEQUENCE; Schema: timesheet; Owner: postgres
--

CREATE SEQUENCE timesheet.timeofftype_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE timesheet.timeofftype_id_seq OWNER TO postgres;

--
-- TOC entry 3097 (class 0 OID 0)
-- Dependencies: 263
-- Name: timeofftype_id_seq; Type: SEQUENCE OWNED BY; Schema: timesheet; Owner: postgres
--

ALTER SEQUENCE timesheet.timeofftype_id_seq OWNED BY timesheet.timeofftype.id;


--
-- TOC entry 264 (class 1259 OID 332719)
-- Name: timesheet; Type: TABLE; Schema: timesheet; Owner: postgres
--

CREATE TABLE timesheet.timesheet (
    id bigint NOT NULL,
    userid bigint NOT NULL,
    timesheetstatusid bigint NOT NULL,
    periodendingdate date NOT NULL,
    notes character varying(255),
    periodstartingdate date NOT NULL
);


ALTER TABLE timesheet.timesheet OWNER TO postgres;

--
-- TOC entry 265 (class 1259 OID 332722)
-- Name: timesheet_id_seq; Type: SEQUENCE; Schema: timesheet; Owner: postgres
--

CREATE SEQUENCE timesheet.timesheet_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE timesheet.timesheet_id_seq OWNER TO postgres;

--
-- TOC entry 3098 (class 0 OID 0)
-- Dependencies: 265
-- Name: timesheet_id_seq; Type: SEQUENCE OWNED BY; Schema: timesheet; Owner: postgres
--

ALTER SEQUENCE timesheet.timesheet_id_seq OWNED BY timesheet.timesheet.id;


--
-- TOC entry 266 (class 1259 OID 332724)
-- Name: timesheetdetails; Type: TABLE; Schema: timesheet; Owner: postgres
--

CREATE TABLE timesheet.timesheetdetails (
    id bigint NOT NULL,
    taskid bigint,
    timesheetid bigint NOT NULL,
    timeofftypeid bigint,
    workdate date NOT NULL,
    hours numeric,
    notes character varying(255)
);


ALTER TABLE timesheet.timesheetdetails OWNER TO postgres;

--
-- TOC entry 267 (class 1259 OID 332730)
-- Name: timesheetdetails_id_seq; Type: SEQUENCE; Schema: timesheet; Owner: postgres
--

CREATE SEQUENCE timesheet.timesheetdetails_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE timesheet.timesheetdetails_id_seq OWNER TO postgres;

--
-- TOC entry 3099 (class 0 OID 0)
-- Dependencies: 267
-- Name: timesheetdetails_id_seq; Type: SEQUENCE OWNED BY; Schema: timesheet; Owner: postgres
--

ALTER SEQUENCE timesheet.timesheetdetails_id_seq OWNED BY timesheet.timesheetdetails.id;


--
-- TOC entry 268 (class 1259 OID 332732)
-- Name: timesheetstatus; Type: TABLE; Schema: timesheet; Owner: postgres
--

CREATE TABLE timesheet.timesheetstatus (
    id bigint NOT NULL,
    statusname character varying(255) NOT NULL
);


ALTER TABLE timesheet.timesheetstatus OWNER TO postgres;

--
-- TOC entry 269 (class 1259 OID 332735)
-- Name: timesheetstatus_id_seq; Type: SEQUENCE; Schema: timesheet; Owner: postgres
--

CREATE SEQUENCE timesheet.timesheetstatus_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE timesheet.timesheetstatus_id_seq OWNER TO postgres;

--
-- TOC entry 3100 (class 0 OID 0)
-- Dependencies: 269
-- Name: timesheetstatus_id_seq; Type: SEQUENCE OWNED BY; Schema: timesheet; Owner: postgres
--

ALTER SEQUENCE timesheet.timesheetstatus_id_seq OWNED BY timesheet.timesheetstatus.id;


--
-- TOC entry 270 (class 1259 OID 332737)
-- Name: users; Type: TABLE; Schema: timesheet; Owner: postgres
--

CREATE TABLE timesheet.users (
    id bigint NOT NULL,
    emailaddress character varying(255) NOT NULL,
    firstname character varying(255) NOT NULL,
    isactive boolean NOT NULL,
    lastname character varying(255) NOT NULL,
    password character varying(255) NOT NULL,
    username character varying(255) NOT NULL,
    trigger_name character varying(200),
    trigger_group character varying(200),
    join_date date
);


ALTER TABLE timesheet.users OWNER TO postgres;

--
-- TOC entry 271 (class 1259 OID 332743)
-- Name: users_id_seq; Type: SEQUENCE; Schema: timesheet; Owner: postgres
--

CREATE SEQUENCE timesheet.users_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE timesheet.users_id_seq OWNER TO postgres;

--
-- TOC entry 3101 (class 0 OID 0)
-- Dependencies: 271
-- Name: users_id_seq; Type: SEQUENCE OWNED BY; Schema: timesheet; Owner: postgres
--

ALTER SEQUENCE timesheet.users_id_seq OWNED BY timesheet.users.id;

--
-- TOC entry 272 (class 1259 OID 332745)
-- Name: usertask; Type: TABLE; Schema: timesheet; Owner: postgres
--

CREATE TABLE timesheet.usertask (
    userid bigint NOT NULL,
    taskid bigint NOT NULL
);

ALTER TABLE timesheet.usertask OWNER TO postgres;

--
-- TOC entry 2911 (class 2604 OID 332748)
-- Name: customer customerid; Type: DEFAULT; Schema: timesheet; Owner: postgres
--

ALTER TABLE ONLY timesheet.customer ALTER COLUMN customerid SET DEFAULT nextval('timesheet.customer_customerid_seq'::regclass);

--
-- TOC entry 2912 (class 2604 OID 332749)
-- Name: project id; Type: DEFAULT; Schema: timesheet; Owner: postgres
--

ALTER TABLE ONLY timesheet.project ALTER COLUMN id SET DEFAULT nextval('timesheet.project_id_seq'::regclass);

--
-- TOC entry 2913 (class 2604 OID 332750)
-- Name: task id; Type: DEFAULT; Schema: timesheet; Owner: postgres
--

ALTER TABLE ONLY timesheet.task ALTER COLUMN id SET DEFAULT nextval('timesheet.task_id_seq'::regclass);

--
-- TOC entry 2914 (class 2604 OID 332751)
-- Name: timeofftype id; Type: DEFAULT; Schema: timesheet; Owner: postgres
--

ALTER TABLE ONLY timesheet.timeofftype ALTER COLUMN id SET DEFAULT nextval('timesheet.timeofftype_id_seq'::regclass);


--
-- TOC entry 2915 (class 2604 OID 332752)
-- Name: timesheet id; Type: DEFAULT; Schema: timesheet; Owner: postgres
--

ALTER TABLE ONLY timesheet.timesheet ALTER COLUMN id SET DEFAULT nextval('timesheet.timesheet_id_seq'::regclass);


--
-- TOC entry 2916 (class 2604 OID 332753)
-- Name: timesheetdetails id; Type: DEFAULT; Schema: timesheet; Owner: postgres
--

ALTER TABLE ONLY timesheet.timesheetdetails ALTER COLUMN id SET DEFAULT nextval('timesheet.timesheetdetails_id_seq'::regclass);


--
-- TOC entry 2917 (class 2604 OID 332754)
-- Name: timesheetstatus id; Type: DEFAULT; Schema: timesheet; Owner: postgres
--

ALTER TABLE ONLY timesheet.timesheetstatus ALTER COLUMN id SET DEFAULT nextval('timesheet.timesheetstatus_id_seq'::regclass);


--
-- TOC entry 2918 (class 2604 OID 332755)
-- Name: users id; Type: DEFAULT; Schema: timesheet; Owner: postgres
--

ALTER TABLE ONLY timesheet.users ALTER COLUMN id SET DEFAULT nextval('timesheet.users_id_seq'::regclass);

--
-- TOC entry 2939 (class 2606 OID 332829)
-- Name: app_configuration app_configuration_pkey; Type: CONSTRAINT; Schema: timesheet; Owner: postgres
--

ALTER TABLE ONLY timesheet.app_configuration
    ADD CONSTRAINT app_configuration_pkey PRIMARY KEY (id);


--
-- TOC entry 2921 (class 2606 OID 332757)
-- Name: customer customer_pkey; Type: CONSTRAINT; Schema: timesheet; Owner: postgres
--

ALTER TABLE ONLY timesheet.customer
    ADD CONSTRAINT customer_pkey PRIMARY KEY (customerid);


--
-- TOC entry 2923 (class 2606 OID 332759)
-- Name: project project_pkey; Type: CONSTRAINT; Schema: timesheet; Owner: postgres
--

ALTER TABLE ONLY timesheet.project
    ADD CONSTRAINT project_pkey PRIMARY KEY (id);


--
-- TOC entry 2925 (class 2606 OID 332761)
-- Name: task task_pkey; Type: CONSTRAINT; Schema: timesheet; Owner: postgres
--

ALTER TABLE ONLY timesheet.task
    ADD CONSTRAINT task_pkey PRIMARY KEY (id);


--
-- TOC entry 2927 (class 2606 OID 332763)
-- Name: timeofftype timeofftype_pkey; Type: CONSTRAINT; Schema: timesheet; Owner: postgres
--

ALTER TABLE ONLY timesheet.timeofftype
    ADD CONSTRAINT timeofftype_pkey PRIMARY KEY (id);


--
-- TOC entry 2929 (class 2606 OID 332765)
-- Name: timesheet timesheet_pkey; Type: CONSTRAINT; Schema: timesheet; Owner: postgres
--

ALTER TABLE ONLY timesheet.timesheet
    ADD CONSTRAINT timesheet_pkey PRIMARY KEY (id);


--
-- TOC entry 2931 (class 2606 OID 332767)
-- Name: timesheetdetails timesheetdetails_pkey; Type: CONSTRAINT; Schema: timesheet; Owner: postgres
--

ALTER TABLE ONLY timesheet.timesheetdetails
    ADD CONSTRAINT timesheetdetails_pkey PRIMARY KEY (id);


--
-- TOC entry 2933 (class 2606 OID 332769)
-- Name: timesheetstatus timesheetstatus_pkey; Type: CONSTRAINT; Schema: timesheet; Owner: postgres
--

ALTER TABLE ONLY timesheet.timesheetstatus
    ADD CONSTRAINT timesheetstatus_pkey PRIMARY KEY (id);


--
-- TOC entry 2935 (class 2606 OID 332771)
-- Name: users users_pkey; Type: CONSTRAINT; Schema: timesheet; Owner: postgres
--

ALTER TABLE ONLY timesheet.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);


--
-- TOC entry 2937 (class 2606 OID 332773)
-- Name: usertask usertask_pkey; Type: CONSTRAINT; Schema: timesheet; Owner: postgres
--

ALTER TABLE ONLY timesheet.usertask
    ADD CONSTRAINT usertask_pkey PRIMARY KEY (userid, taskid);


--
-- TOC entry 2940 (class 2606 OID 332774)
-- Name: project project_customerid_fkey; Type: FK CONSTRAINT; Schema: timesheet; Owner: postgres
--

ALTER TABLE ONLY timesheet.project
    ADD CONSTRAINT project_customerid_fkey FOREIGN KEY (customerid) REFERENCES timesheet.customer(customerid);


--
-- TOC entry 2941 (class 2606 OID 332779)
-- Name: task task_projectid_fkey; Type: FK CONSTRAINT; Schema: timesheet; Owner: postgres
--

ALTER TABLE ONLY timesheet.task
    ADD CONSTRAINT task_projectid_fkey FOREIGN KEY (projectid) REFERENCES timesheet.project(id);


--
-- TOC entry 2942 (class 2606 OID 332784)
-- Name: timesheet timesheet_timesheetstatus_fkey; Type: FK CONSTRAINT; Schema: timesheet; Owner: postgres
--

ALTER TABLE ONLY timesheet.timesheet
    ADD CONSTRAINT timesheet_timesheetstatus_fkey FOREIGN KEY (timesheetstatusid) REFERENCES timesheet.timesheetstatus(id);


--
-- TOC entry 2943 (class 2606 OID 332789)
-- Name: timesheet timesheet_userid_fkey; Type: FK CONSTRAINT; Schema: timesheet; Owner: postgres
--

ALTER TABLE ONLY timesheet.timesheet
    ADD CONSTRAINT timesheet_userid_fkey FOREIGN KEY (userid) REFERENCES timesheet.users(id);


--
-- TOC entry 2944 (class 2606 OID 332794)
-- Name: timesheetdetails timesheetdetails_taskid_fkey; Type: FK CONSTRAINT; Schema: timesheet; Owner: postgres
--

ALTER TABLE ONLY timesheet.timesheetdetails
    ADD CONSTRAINT timesheetdetails_taskid_fkey FOREIGN KEY (taskid) REFERENCES timesheet.task(id);


--
-- TOC entry 2945 (class 2606 OID 332799)
-- Name: timesheetdetails timesheetdetails_timeofftypeid_fkey; Type: FK CONSTRAINT; Schema: timesheet; Owner: postgres
--

ALTER TABLE ONLY timesheet.timesheetdetails
    ADD CONSTRAINT timesheetdetails_timeofftypeid_fkey FOREIGN KEY (timeofftypeid) REFERENCES timesheet.timeofftype(id);


--
-- TOC entry 2946 (class 2606 OID 332804)
-- Name: timesheetdetails timesheetdetails_timesheetid_fkey; Type: FK CONSTRAINT; Schema: timesheet; Owner: postgres
--

ALTER TABLE ONLY timesheet.timesheetdetails
    ADD CONSTRAINT timesheetdetails_timesheetid_fkey FOREIGN KEY (timesheetid) REFERENCES timesheet.timesheet(id);


--
-- TOC entry 2947 (class 2606 OID 332809)
-- Name: usertask usertask_taskid_fkey; Type: FK CONSTRAINT; Schema: timesheet; Owner: postgres
--

ALTER TABLE ONLY timesheet.usertask
    ADD CONSTRAINT usertask_taskid_fkey FOREIGN KEY (taskid) REFERENCES timesheet.task(id);


--
-- TOC entry 2948 (class 2606 OID 332814)
-- Name: usertask usertask_userid_fkey; Type: FK CONSTRAINT; Schema: timesheet; Owner: postgres
--

ALTER TABLE ONLY timesheet.usertask
    ADD CONSTRAINT usertask_userid_fkey FOREIGN KEY (userid) REFERENCES timesheet.users(id);


-- Completed on 2021-02-16 11:46:03

--
-- PostgreSQL database dump complete
--

