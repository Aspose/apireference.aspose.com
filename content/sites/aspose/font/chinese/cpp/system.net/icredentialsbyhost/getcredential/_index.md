---
title: "System::Net::ICredentialsByHost::GetCredential 方法"
linktitle: "GetCredential"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::ICredentialsByHost::GetCredential 方法。 C++ 中的 RTTI 信息。"
type: docs
weight: 100
url: /zh/cpp/system.net/icredentialsbyhost/getcredential/
---
## ICredentialsByHost::GetCredential method


RTTI 信息。

```cpp
virtual System::SharedPtr<NetworkCredential> System::Net::ICredentialsByHost::GetCredential(String host, int32_t port, String authenticationType)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| host | String | 对客户端进行身份验证的主机。 |
| port | int32_t | 主机端口号。 |
| authenticationType | String | 身份验证类型。 |
## 备注


返回指定主机和身份验证类型的凭据。
## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [String](../../../system/string/)
* Class [ICredentialsByHost](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
