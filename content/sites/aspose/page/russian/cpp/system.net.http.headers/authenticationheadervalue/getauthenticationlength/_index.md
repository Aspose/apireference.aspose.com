---
title: "System::Net::Http::Headers::AuthenticationHeaderValue::GetAuthenticationLength method"
linktitle: "GetAuthenticationLength"
second_title: "Aspose.Page для C++"
description: "System::Net::Http::Headers::AuthenticationHeaderValue::GetAuthenticationLength метод. Разбирает указанную строку и возвращает последний индекс строкового представления в C++."
type: docs
weight: 800
url: /ru/cpp/system.net.http.headers/authenticationheadervalue/getauthenticationlength/
---
## AuthenticationHeaderValue::GetAuthenticationLength method


Разбирает указанную строку и возвращает последний индекс её строкового представления.

```cpp
static int32_t System::Net::Http::Headers::AuthenticationHeaderValue::GetAuthenticationLength(String input, int32_t startIndex, System::SharedPtr<Object> &parsedValue)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| input | String | Строка, которую необходимо разобрать. |
| startIndex | int32_t | Начальная позиция для разбора. |
| parsedValue | System::SharedPtr\<Object\>\& | Выходной параметр, в который будет записано разобранное значение. |

### ReturnValue

Длина разобранной подстроки, иначе 0.

## См. также

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [AuthenticationHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Page for C++](../../../)
