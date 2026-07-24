---
title: "System::Net::CookieCollection::InternalAdd method"
linktitle: "InternalAdd"
second_title: "Aspose.Page för C++"
description: "System::Net::CookieCollection::InternalAdd method. Lägger till den angivna kakan i samlingen i C++."
type: docs
weight: 1000
url: /sv/cpp/system.net/cookiecollection/internaladd/
---
## CookieCollection::InternalAdd method


Lägger till den angivna cookien i samlingen.

```cpp
int32_t System::Net::CookieCollection::InternalAdd(System::SharedPtr<Cookie> cookie, bool isStrict)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| cookie | System::SharedPtr\<Cookie\> | Cookien att lägga till. |
| isStrict | bool | Sant när den angivna kakan måste ersätta den gamla, annars falskt. |

### ReturnValue

0 när den angivna kakan ersatte den gamla, annars 1.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Cookie](../../cookie/)
* Class [CookieCollection](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
