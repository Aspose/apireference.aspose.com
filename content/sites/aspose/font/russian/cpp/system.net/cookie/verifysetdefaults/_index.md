---
title: "System::Net::Cookie::VerifySetDefaults метод"
linktitle: "VerifySetDefaults"
second_title: "Aspose.Font для C++"
description: "System::Net::Cookie::VerifySetDefaults метод. Проверяет и задает значения атрибутов по умолчанию в C++."
type: docs
weight: 4200
url: /ru/cpp/system.net/cookie/verifysetdefaults/
---
## Cookie::VerifySetDefaults method


Проверяет и устанавливает значения атрибутов по умолчанию.

```cpp
bool System::Net::Cookie::VerifySetDefaults(CookieVariant variant, System::SharedPtr<Uri> uri, bool isLocalDomain, String localDomain, bool setDefault, bool shouldThrow)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| variant | CookieVariant | Спецификация cookie. |
| uri | System::SharedPtr\<Uri\> | Экземпляр класса Uri, который используется для инициализации внутренних полей. |
| isLocalDomain | bool | Значение, указывающее, помещается ли cookie в локальный домен. |
| localDomain | String | Локальное имя домена. |
| setDefault | bool | Значение, указывающее, должны ли атрибуты cookie быть инициализированы с использованием их значений по умолчанию. |
| shouldThrow | bool | Значение, указывающее, должно ли быть выброшено исключение, когда указанные значения недействительны. |

### ReturnValue

Истина, когда все значения действительны, иначе ложь.

## См. также

* Enum [CookieVariant](../../cookievariant/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [Cookie](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
