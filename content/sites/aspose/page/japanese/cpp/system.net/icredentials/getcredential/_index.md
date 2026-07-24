---
title: "System::Net::ICredentials::GetCredential メソッド"
linktitle: "GetCredential"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::ICredentials::GetCredential メソッド。C++ の RTTI 情報です。"
type: docs
weight: 100
url: /ja/cpp/system.net/icredentials/getcredential/
---
## ICredentials::GetCredential method


RTTI 情報。

```cpp
virtual System::SharedPtr<NetworkCredential> System::Net::ICredentials::GetCredential(System::SharedPtr<Uri> uri, String authType)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| uri | System::SharedPtr\<Uri\> | 認証タイプがクライアントによって提供される URI。 |
| authType | String | 認証タイプ。 |
## 備考


指定された URI と認証タイプの資格情報を返します。
## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [ICredentials](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
