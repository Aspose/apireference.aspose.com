---
title: "System::Net::CookieCollection::InternalAdd method"
linktitle: "InternalAdd"
second_title: "Aspose.Page para C++"
description: "System::Net::CookieCollection::InternalAdd method. Añade la cookie especificada a la colección en C++."
type: docs
weight: 1000
url: /es/cpp/system.net/cookiecollection/internaladd/
---
## CookieCollection::InternalAdd method


Agrega la cookie especificada a la colección.

```cpp
int32_t System::Net::CookieCollection::InternalAdd(System::SharedPtr<Cookie> cookie, bool isStrict)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| cookie | System::SharedPtr\<Cookie\> | La cookie a añadir. |
| isStrict | bool | Verdadero cuando la cookie especificada debe reemplazar a la anterior, de lo contrario falso. |

### ReturnValue

0 cuando la cookie especificada reemplazó a la anterior, de lo contrario 1.

## Ver también

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Cookie](../../cookie/)
* Class [CookieCollection](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
