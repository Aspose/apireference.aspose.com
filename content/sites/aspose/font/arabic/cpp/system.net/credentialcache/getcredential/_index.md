---
title: "طريقة System::Net::CredentialCache::GetCredential"
linktitle: "GetCredential"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::CredentialCache::GetCredential. تُرجع بيانات الاعتماد للاسم المضيف المحدد، المنفذ، ونوع المصادقة في C++."
type: docs
weight: 500
url: /ar/cpp/system.net/credentialcache/getcredential/
---
## CredentialCache::GetCredential(String, int32_t, String) method


يعيد بيانات الاعتماد لاسم المضيف المحدد، المنفذ، ونوع المصادقة.

```cpp
System::SharedPtr<NetworkCredential> System::Net::CredentialCache::GetCredential(String host, int32_t port, String authenticationType) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| host | String | اسم المضيف المرتبط ببيانات الاعتماد. |
| منفذ | int32_t | رقم المنفذ. |
| authenticationType | String | نوع المصادقة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
## CredentialCache::GetCredential(System::SharedPtr\<Uri\>, String) method


يرجع الاعتمادات للبادئة URI المحددة ونوع المصادقة.

```cpp
System::SharedPtr<NetworkCredential> System::Net::CredentialCache::GetCredential(System::SharedPtr<Uri> uriPrefix, String authenticationType) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| uriPrefix | System::SharedPtr\<Uri\> | بادئة URI. |
| authenticationType | String | نوع مصادقة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
