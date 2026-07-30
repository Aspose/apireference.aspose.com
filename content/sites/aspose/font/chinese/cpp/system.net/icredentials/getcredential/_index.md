---
title: "System::Net::ICredentials::GetCredential 方法"
linktitle: "GetCredential"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::ICredentials::GetCredential 方法。C++ 中的 RTTI 信息。"
type: docs
weight: 100
url: /zh/cpp/system.net/icredentials/getcredential/
---
## ICredentials::GetCredential method


RTTI 信息。

```cpp
virtual System::SharedPtr<NetworkCredential> System::Net::ICredentials::GetCredential(System::SharedPtr<Uri> uri, String authType)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| uri | System::SharedPtr\<Uri\> | 客户端提供身份验证类型的 URI。 |
| authType | String | 身份验证类型。 |
## 备注


返回指定 URI 和身份验证类型的凭据。
## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [ICredentials](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
