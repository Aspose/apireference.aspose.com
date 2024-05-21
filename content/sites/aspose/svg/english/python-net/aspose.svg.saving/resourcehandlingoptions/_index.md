---
title: ResourceHandlingOptions class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 50
url: /aspose.svg.saving/resourcehandlingoptions/
is_root: false
---

## ResourceHandlingOptions class

Represents resource handling options.



The ResourceHandlingOptions type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [java_script](./aspose.svg.saving/resourcehandlingoptions/java_script) | Gets or sets enum which represents the way scripts are handled. Currently [`ResourceHandling.SAVE`](./aspose.svg.saving/resourcehandling#SAVE), [`ResourceHandling.IGNORE`](./aspose.svg.saving/resourcehandling#IGNORE), [`ResourceHandling.DISCARD`](./aspose.svg.saving/resourcehandling#DISCARD) and [`ResourceHandling.EMBED`](./aspose.svg.saving/resourcehandling#EMBED) values are supported. Default value is [`ResourceHandling.SAVE`](./aspose.svg.saving/resourcehandling#SAVE). |
| [default](./aspose.svg.saving/resourcehandlingoptions/default) | Gets or sets enum which represents default way of resources handling. Currently [`ResourceHandling.SAVE`](./aspose.svg.saving/resourcehandling#SAVE), [`ResourceHandling.IGNORE`](./aspose.svg.saving/resourcehandling#IGNORE) and [`ResourceHandling.EMBED`](./aspose.svg.saving/resourcehandling#EMBED) values are supported. Default value is [`ResourceHandling.SAVE`](./aspose.svg.saving/resourcehandling#SAVE). |
| [resource_url_restriction](./aspose.svg.saving/resourcehandlingoptions/resource_url_restriction) | Gets or sets restriction applied to URLs of handled resources such as css, js, images etc. Default value is [`UrlRestriction.SAME_HOST`](./aspose.svg.saving/urlrestriction#SAME_HOST). |
| [page_url_restriction](./aspose.svg.saving/resourcehandlingoptions/page_url_restriction) | Gets or sets restriction applied to URLs of handled pages. Default value is [`UrlRestriction.ROOT_AND_SUB_FOLDERS`](./aspose.svg.saving/urlrestriction#ROOT_AND_SUB_FOLDERS). |
| [max_handling_depth](./aspose.svg.saving/resourcehandlingoptions/max_handling_depth) | Gets or sets maximum depth of pages which will be handled. Depth of 1 means that only pages directly referenced from the saved document will be handled. Setting this property to -1 will lead to handling of all pages. Default value is 0. |



### See Also
* module [`aspose.svg.saving`](..)
