---
title: "طريقة System::Net::CredentialCache::Add"
linktitle: "Add"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Net::CredentialCache::Add. تُضيف بيانات الاعتماد الشبكية المحددة إلى الذاكرة المؤقتة في C++."
type: docs
weight: 400
url: /ar/cpp/system.net/credentialcache/add/
---
## CredentialCache::Add(String, int32_t, String, System::SharedPtr\<NetworkCredential\>) method


يضيف الاعتمادات الشبكية المحددة إلى الذاكرة المؤقتة.

```cpp
void System::Net::CredentialCache::Add(String host, int32_t port, String authenticationType, System::SharedPtr<NetworkCredential> credential)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| host | String | اسم المضيف المرتبط ببيانات الاعتماد. |
| منفذ | int32_t | رقم المنفذ. |
| authenticationType | String | نظام المصادقة. |
| الاعتماد | System::SharedPtr\<NetworkCredential\> | بيانات الاعتماد للإضافة. |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
## CredentialCache::Add(System::SharedPtr\<Uri\>, String, System::SharedPtr\<NetworkCredential\>) method


يضيف الاعتمادات الشبكية المحددة إلى الذاكرة المؤقتة.

```cpp
void System::Net::CredentialCache::Add(System::SharedPtr<Uri> uriPrefix, String authenticationType, System::SharedPtr<NetworkCredential> credential)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| uriPrefix | System::SharedPtr\<Uri\> | بادئة URI للموارد التي ترتبط بها بيانات الاعتماد. |
| authenticationType | String | نظام المصادقة. |
| الاعتماد | System::SharedPtr\<NetworkCredential\> | بيانات الاعتماد للإضافة. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [NetworkCredential](../../networkcredential/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
