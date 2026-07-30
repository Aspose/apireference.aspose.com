---
title: "Méthode System::CastEnumerableTo"
linktitle: "CastEnumerableTo"
second_title: "Aspose.Font pour C++"
description: "Méthode System::CastEnumerableTo. Effectue le transtypage explicite des éléments de l'objet énumérable spécifié vers un type différent en C++."
type: docs
weight: 15600
url: /fr/cpp/system/castenumerableto/
---
## System::CastEnumerableTo(const From\&) method


Effectue le transtypage explicite des éléments de l'objet énumérable spécifié vers un type différent.

```cpp
template<class To,class From> std::enable_if<!System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Paramètre | Description |
| --- | --- |
| To | Le type vers lequel caster statiquement les éléments de l'objet énumérable |
| From | Le type de l'objet énumérable |

| Paramètre | Type | Description |
| --- | --- | --- |
| énumérable | const From\& | Objet énumérable contenant les éléments à caster |

### ReturnValue

Un pointeur vers une nouvelle collection contenant des éléments de type **To** équivalents aux éléments de **enumerable**

## Voir aussi

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::CastEnumerableTo(const From\&) method


Effectue le transtypage explicite des éléments de l'objet énumérable spécifié vers un type différent.

```cpp
template<class To,class From> std::enable_if<System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Paramètre | Description |
| --- | --- |
| To | Le type vers lequel caster statiquement les éléments de l'objet énumérable |
| From | Le type de l'objet énumérable |

| Paramètre | Type | Description |
| --- | --- | --- |
| énumérable | const From\& | est un héritier de l'objet Enumerable avec une méthode get_Count définie et contenant les éléments à caster |

### ReturnValue

Un pointeur vers une nouvelle collection contenant des éléments de type **To** équivalents aux éléments de **enumerable**

## Voir aussi

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
