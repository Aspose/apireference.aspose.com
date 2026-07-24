---
title: "System::Net::Cookie::VerifySetDefaults método"
linktitle: "VerifySetDefaults"
second_title: "Aspose.Page para C++"
description: "System::Net::Cookie::VerifySetDefaults method. Verifica y establece los valores predeterminados del atributo''s en C++."
type: docs
weight: 4200
url: /es/cpp/system.net/cookie/verifysetdefaults/
---
## Cookie::VerifySetDefaults method


Verifica y establece los valores del atributo predeterminado.

```cpp
bool System::Net::Cookie::VerifySetDefaults(CookieVariant variant, System::SharedPtr<Uri> uri, bool isLocalDomain, String localDomain, bool setDefault, bool shouldThrow)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| variante | CookieVariant | La especificación de la cookie. |
| uri | System::SharedPtr\<Uri\> | La instancia de la clase Uri que se usa para inicializar los campos internos. |
| isLocalDomain | bool | Un valor que indica si la cookie se inserta en el dominio local. |
| localDomain | String | Un nombre de dominio local. |
| setDefault | bool | Un valor que indica si los atributos de la cookie deben inicializarse usando sus valores predeterminados. |
| shouldThrow | bool | Un valor que indica si se debe lanzar una excepción cuando los valores especificados son inválidos. |

### ReturnValue

Verdadero cuando todos los valores son válidos, de lo contrario falso.

## Ver también

* Enum [CookieVariant](../../cookievariant/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [Cookie](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
