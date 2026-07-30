---
title: "System::Net::CookieCollection::InternalAdd method"
linktitle: "InternalAdd"
second_title: "Aspose.Font per C++"
description: "System::Net::CookieCollection::InternalAdd method. Aggiunge il cookie specificato alla raccolta in C++."
type: docs
weight: 1000
url: /it/cpp/system.net/cookiecollection/internaladd/
---
## CookieCollection::InternalAdd method


Aggiunge il cookie specificato alla raccolta.

```cpp
int32_t System::Net::CookieCollection::InternalAdd(System::SharedPtr<Cookie> cookie, bool isStrict)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| cookie | System::SharedPtr\<Cookie\> | Il cookie da aggiungere. |
| isStrict | bool | True quando il cookie specificato deve sostituire quello vecchio, altrimenti false. |

### ReturnValue

0 quando il cookie specificato ha sostituito quello vecchio, altrimenti 1.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Cookie](../../cookie/)
* Class [CookieCollection](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
