package com.fastcode.timesheet.addons.reporting.application.permalink;

import org.mapstruct.Mapper;

import com.fastcode.timesheet.addons.reporting.application.permalink.dto.*;
import com.fastcode.timesheet.addons.reporting.domain.permalink.Permalink;

@Mapper(componentModel = "spring")
public interface IPermalinkMapper {

   Permalink createPermalinkInputToPermalink(CreatePermalinkInput permalinkDto);
   
   CreatePermalinkOutput permalinkToCreatePermalinkOutput(Permalink entity);

    Permalink updatePermalinkInputToPermalink(UpdatePermalinkInput permalinkDto);

   UpdatePermalinkOutput permalinkToUpdatePermalinkOutput(Permalink entity);

   FindPermalinkByIdOutput permalinkToFindPermalinkByIdOutput(Permalink entity);


}

