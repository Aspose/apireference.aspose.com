---
title: "Метод System::Net::CookieCollection::InternalAdd"
linktitle: "InternalAdd"
second_title: "Aspose.Font для C++"
description: "Метод System::Net::CookieCollection::InternalAdd. Добавляет указанный cookie в коллекцию в C++."
type: docs
weight: 1000
url: /ru/cpp/system.net/cookiecollection/internaladd/
---
## CookieCollection::InternalAdd method


Добавляет указанную cookie в коллекцию.

```cpp
int32_t System::Net::CookieCollection::InternalAdd(System::SharedPtr<Cookie> cookie, bool isStrict)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| куки | System::SharedPtr\<Cookie\> | Кука для добавления. |
| isStrict | bool | True, когда указанная cookie должна заменить старую, иначе false. |

### ReturnValue

0, когда указанная cookie заменила старую, иначе 1.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Cookie](../../cookie/)
* Class [CookieCollection](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
