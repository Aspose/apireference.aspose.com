---
title: "System::Web::Services::Protocols::SoapMessage::FindHeader メソッド"
linktitle: "FindHeader"
second_title: "C++ 用 Aspose.Page"
description: "System::Web::Services::Protocols::SoapMessage::FindHeader メソッド。指定されたヘッダータイプによりヘッダーのマッピングを C++ で検索します。"
type: docs
weight: 300
url: /ja/cpp/system.web.services.protocols/soapmessage/findheader/
---
## SoapMessage::FindHeader method


指定されたヘッダータイプでヘッダーのマッピングを検索します。

```cpp
System::SharedPtr<SoapHeaderMapping> System::Web::Services::Protocols::SoapMessage::FindHeader(System::ArrayPtr<System::SharedPtr<SoapHeaderMapping>> headersInfo, const TypeInfo &headerType)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| headersInfo | System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\> | ヘッダー マッピングのコレクションです。 |
| headerType | const TypeInfo\& | 検索するヘッダータイプです。 |

### ReturnValue

ヘッダーのマッピングです。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [SoapMessage](../)
* Namespace [System::Web::Services::Protocols](../../)
* Library [Aspose.Page for C++](../../../)
