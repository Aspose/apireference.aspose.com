---
title: "System::ObjectExt::ArrayInitializerCast μέθοδος"
linktitle: "ArrayInitializerCast"
second_title: "Aspose.Page για C++"
description: "System::ObjectExt::ArrayInitializerCast μέθοδος. Μετατρέπει τις βασικές τιμές του πίνακα (που το C# κάνει αυτόματα αλλά το C++ προφανώς δεν κάνει) σε C++."
type: docs
weight: 100
url: /el/cpp/system/objectext/arrayinitializercast/
---
## ObjectExt::ArrayInitializerCast method


Μετατρέπει τις βασικές τιμές πίνακα (που η C# κάνει αυτόματα, αλλά η C++ προφανώς όχι).

```cpp
template<typename To,typename ...> static std::enable_if<(std::is_fundamental<To>::value), std::array<To, sizeof...(From)>>::type System::ObjectExt::ArrayInitializerCast(From ...args)
```


| Parameter | Περιγραφή |
| --- | --- |
| Προς | Τύπος στόχου. |
| From | Τύποι πηγής. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| args | Από ... | Τιμές προς μετατροπή και προσθήκη στον πίνακα προορισμού. |

### ReturnValue

[Array](../../array/) containing converted copies of all arguments in the same order.

## Δείτε επίσης

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
