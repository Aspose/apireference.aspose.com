---
title: "System::Net::CookieCollection::InternalAdd метод"
linktitle: "InternalAdd"
second_title: "Aspose.Page для C++"
description: "System::Net::CookieCollection::InternalAdd метод. Добавляет указанный cookie в коллекцию в C++."
type: docs
weight: 1000
url: /ru/cpp/system.net/cookiecollection/internaladd/
---
## CookieCollection::InternalAdd method


Добавляет указанный cookie в коллекцию.

```cpp
int32_t System::Net::CookieCollection::InternalAdd(System::SharedPtr<Cookie> cookie, bool isStrict)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| cookie | System::SharedPtr\<Cookie\> | Cookie для добавления. |
| isStrict | bool | True, когда указанный cookie должен заменить старый, иначе false. |

### ReturnValue

0, когда указанный cookie заменил старый, иначе 1.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Cookie](../../cookie/)
* Class [CookieCollection](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
