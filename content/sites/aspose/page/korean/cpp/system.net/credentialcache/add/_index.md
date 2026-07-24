---
title: "System::Net::CredentialCache::Add 메서드"
linktitle: "Add"
second_title: "C++용 Aspose.Page"
description: "System::Net::CredentialCache::Add 메서드. 지정된 네트워크 자격 증명을 C++의 캐시에 추가합니다."
type: docs
weight: 400
url: /ko/cpp/system.net/credentialcache/add/
---
## CredentialCache::Add(String, int32_t, String, System::SharedPtr\<NetworkCredential\>) method


지정된 네트워크 자격 증명을 캐시에 추가합니다.

```cpp
void System::Net::CredentialCache::Add(String host, int32_t port, String authenticationType, System::SharedPtr<NetworkCredential> credential)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| host | String | 자격 증명이 연결된 호스트 이름입니다. |
| 포트 | int32_t | 포트 번호입니다. |
| authenticationType | String | 인증 스키마입니다. |
| credential | System::SharedPtr\<NetworkCredential\> | 추가할 자격 증명입니다. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## CredentialCache::Add(System::SharedPtr\<Uri\>, String, System::SharedPtr\<NetworkCredential\>) method


지정된 네트워크 자격 증명을 캐시에 추가합니다.

```cpp
void System::Net::CredentialCache::Add(System::SharedPtr<Uri> uriPrefix, String authenticationType, System::SharedPtr<NetworkCredential> credential)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| uriPrefix | System::SharedPtr\<Uri\> | 자격 증명이 연결된 리소스의 URI 접두사입니다. |
| authenticationType | String | 인증 스키마입니다. |
| credential | System::SharedPtr\<NetworkCredential\> | 추가할 자격 증명입니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [NetworkCredential](../../networkcredential/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
