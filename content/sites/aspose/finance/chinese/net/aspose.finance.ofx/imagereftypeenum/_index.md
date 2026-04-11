---
title: ImageRefTypeEnum
second_title: Aspose.Finance 适用于 .NET API 参考
description: 图像引用类型 enum。
type: docs
weight: 2320
url: /zh/net/aspose.finance.ofx/imagereftypeenum/
---
## ImageRefTypeEnum enumeration

图像引用类型 enum。

```csharp
public enum ImageRefTypeEnum
```

### 值

| 名称 | 值 | 描述 |
| --- | --- | --- |
| OPAQUE | `0` | 该图像通过显式的 OFX [`ImageRequest`](../../aspose.finance.ofx.image/imagerequest) 请求访问，随后将返回图像数据。 |
| URL | `1` | 该图像直接通过提供的 URL 访问。无法通过 OFX 图像请求检索该图像。预期客户端不会提供身份验证，只需遵循提供的 URL。 |
| FORMURL | `2` | 该图像直接通过编码的 URL 访问。无法通过 OFX 图像请求检索该图像。预期客户端将向服务器发送身份验证。 |

### 另请参阅

* namespace [Aspose.Finance.Ofx](../../aspose.finance.ofx)
* assembly [Aspose.Finance](../../)

<!-- 请勿编辑：由 xmldocmd 为 Aspose.Finance.dll 生成 -->
