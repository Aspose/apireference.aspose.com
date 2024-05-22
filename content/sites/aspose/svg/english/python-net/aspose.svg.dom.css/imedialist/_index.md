---
title: IMediaList class
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 260
url: /python-net/aspose.svg.dom.css/imedialist/
is_root: false
---

## IMediaList class

The MediaList interface provides the abstraction of an ordered collection of media, without defining or constraining how this collection is implemented. An empty list is the same as a list that contains the medium "all".



The IMediaList type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [media_text](/svg/python-net/aspose.svg.dom.css/imedialist/media_text) | The parsable textual representation of the media list. This is a comma-separated list of media. |
| [length](/svg/python-net/aspose.svg.dom.css/imedialist/length) | The number of media in the list. The range of valid media is 0 to length-1 inclusive. |



Returns the indexth in the list. If index is greater than or equal to the number of media in the list, this returns null.
The media index.
### Indexer
| Name | Description |
| :- | :- |
| [index] |  |


### Methods
| Method | Description |
| :- | :- |
| [delete_medium](/svg/python-net/aspose.svg.dom.css/imedialist/delete_medium/#str) | Deletes the medium indicated by oldMedium from the list. |
| [append_medium](/svg/python-net/aspose.svg.dom.css/imedialist/append_medium/#str) | Adds the medium newMedium to the end of the list. If the newMedium is already used, it is first removed. |



### See Also
* module [`aspose.svg.dom.css`](..)
