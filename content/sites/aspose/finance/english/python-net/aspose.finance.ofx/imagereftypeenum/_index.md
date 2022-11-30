---
title: ImageRefTypeEnum enumeration
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 1140
url: /python-net/aspose.finance.ofx/imagereftypeenum/
is_root: false
---

## ImageRefTypeEnum enumeration

Image reference type enum.



The ImageRefTypeEnum type exposes the following members:

### Fields
| Field | Description |
| :- | :- |
| OPAQUE | The image is accessed via an explicit OFX [ImageRequest](/finance/python-net/aspose.finance.ofx.image/imagerequest) request, which will be followed by the image data. |
| URL | The image is accessed directly via the URL provided. The image cannot be retrieved via an OFX image request. The expectation is<br/>that the client will not provide authentication and will simply follow the URL provided. |
| FORMURL | The image is accessed directly via an encoded URL. The image cannot be retrieved via an OFX image request. The expectation is<br/>that the client will send authentication to the server. |


### See Also

* module [aspose.finance.ofx](../)
