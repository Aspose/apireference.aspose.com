---
title: ReferrerPolicy Enum
second_title: Aspose.SVG for .NET API Reference
description: Aspose.Svg.Builder.ReferrerPolicy enum. Specifies the referrer policy to be used when fetching resources
type: docs
weight: 1020
url: /net/aspose.svg.builder/referrerpolicy/
---
## ReferrerPolicy enumeration

Specifies the referrer policy to be used when fetching resources.

```csharp
public enum ReferrerPolicy
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| None | `0` | No referrer policy is set. |
| NoReferrer | `1` | The Referer header will not be sent. |
| NoReferrerWhenDowngrade | `2` | The Referer header will not be sent to origins with less security (HTTPS -&gt; HTTP). |
| SameOrigin | `3` | The Referer header will be sent for same-origin requests only. |
| Origin | `4` | Only the origin of the document will be sent as the Referer header. |
| StrictOrigin | `5` | Only the origin of the document will be sent as the Referer header for secure contexts. |
| OriginWhenCrossOrigin | `6` | The full URL will be sent as the Referer header for same-origin requests, but only the origin for cross-origin requests. |
| StrictOriginWhenCrossOrigin | `7` | Only the origin of the document will be sent as the Referer header for same-origin requests, but no header for cross-origin requests in insecure contexts. |
| UnsafeUrl | `8` | The full URL, including the path and query string, will always be sent as the Referer header. |

### See Also

* namespace [Aspose.Svg.Builder](../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../)
