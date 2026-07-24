---
title: "System::Net::CredentialCache::GetCredential 메서드"
linktitle: "GetCredential"
second_title: "C++용 Aspose.Page"
description: "System::Net::CredentialCache::GetCredential 메서드. C++에서 지정된 호스트 이름, 포트 및 인증 유형에 대한 자격 증명을 반환합니다."
type: docs
weight: 500
url: /ko/cpp/system.net/credentialcache/getcredential/
---
## CredentialCache::GetCredential(String, int32_t, String) method


지정된 호스트 이름, 포트 및 인증 유형에 대한 자격 증명을 반환합니다.

```cpp
System::SharedPtr<NetworkCredential> System::Net::CredentialCache::GetCredential(String host, int32_t port, String authenticationType) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| host | String | 자격 증명이 연결된 호스트 이름입니다. |
| 포트 | int32_t | 포트 번호입니다. |
| authenticationType | String | 인증 유형. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## CredentialCache::GetCredential(System::SharedPtr\<Uri\>, String) method


지정된 URI 접두사와 인증 유형에 대한 자격 증명을 반환합니다.

```cpp
System::SharedPtr<NetworkCredential> System::Net::CredentialCache::GetCredential(System::SharedPtr<Uri> uriPrefix, String authenticationType) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| uriPrefix | System::SharedPtr\<Uri\> | URI 접두사입니다. |
| authenticationType | String | 인증 유형입니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
