---
title: ReferrerPolicy enumeration
second_title: Aspose.SVG for Python via .NET API References
description: 
type: docs
weight: 1660
url: /python-net/aspose.svg.builder/referrerpolicy/
is_root: false
---

## ReferrerPolicy enumeration

Specifies the referrer policy to be used when fetching resources.



The ReferrerPolicy type exposes the following members:

### Fields
| Field | Description |
| :- | :- |
| NONE | No referrer policy is set. |
| NO_REFERRER | The Referer header will not be sent. |
| NO_REFERRER_WHEN_DOWNGRADE | The Referer header will not be sent to origins with less security (HTTPS -> HTTP). |
| SAME_ORIGIN | The Referer header will be sent for same-origin requests only. |
| ORIGIN | Only the origin of the document will be sent as the Referer header. |
| STRICT_ORIGIN | Only the origin of the document will be sent as the Referer header for secure contexts. |
| ORIGIN_WHEN_CROSS_ORIGIN | The full URL will be sent as the Referer header for same-origin requests, but only the origin for cross-origin requests. |
| STRICT_ORIGIN_WHEN_CROSS_ORIGIN | Only the origin of the document will be sent as the Referer header for same-origin requests, but no header for cross-origin requests in insecure contexts. |
| UNSAFE_URL | The full URL, including the path and query string, will always be sent as the Referer header. |



### See Also
* module [`aspose.svg.builder`](..)
