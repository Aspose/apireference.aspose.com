---
title: "System::Net::ICredentialsByHost::GetCredential メソッド"
linktitle: "GetCredential"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::ICredentialsByHost::GetCredential メソッド。C++ における RTTI 情報です。"
type: docs
weight: 100
url: /ja/cpp/system.net/icredentialsbyhost/getcredential/
---
## ICredentialsByHost::GetCredential method


RTTI 情報。

```cpp
virtual System::SharedPtr<NetworkCredential> System::Net::ICredentialsByHost::GetCredential(String host, int32_t port, String authenticationType)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| host | String | クライアントを認証するホスト。 |
| ポート | int32_t | ホストのポート番号。 |
| authenticationType | String | 認証タイプ。 |
## 備考


指定されたホストおよび認証タイプの資格情報を返します。
## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [String](../../../system/string/)
* Class [ICredentialsByHost](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
