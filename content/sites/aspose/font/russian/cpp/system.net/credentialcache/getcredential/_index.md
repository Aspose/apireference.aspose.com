---
title: "Метод System::Net::CredentialCache::GetCredential"
linktitle: "GetCredential"
second_title: "Aspose.Font для C++"
description: "Метод System::Net::CredentialCache::GetCredential. Возвращает учетные данные для указанного имени хоста, порта и типа аутентификации в C++."
type: docs
weight: 500
url: /ru/cpp/system.net/credentialcache/getcredential/
---
## CredentialCache::GetCredential(String, int32_t, String) method


Возвращает учетные данные для указанного имени хоста, порта и типа аутентификации.

```cpp
System::SharedPtr<NetworkCredential> System::Net::CredentialCache::GetCredential(String host, int32_t port, String authenticationType) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| host | String | Имя хоста, с которым связаны учетные данные. |
| port | int32_t | Номер порта. |
| authenticationType | String | Тип аутентификации. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
## CredentialCache::GetCredential(System::SharedPtr\<Uri\>, String) method


Возвращает учётные данные для указанного префикса URI и типа аутентификации.

```cpp
System::SharedPtr<NetworkCredential> System::Net::CredentialCache::GetCredential(System::SharedPtr<Uri> uriPrefix, String authenticationType) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| uriPrefix | System::SharedPtr\<Uri\> | Префикс URI. |
| authenticationType | String | Тип аутентификации. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
