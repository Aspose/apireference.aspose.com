---
title: "System::Collections::Generic::List::ConvertAll method"
linktitle: "ConvertAll"
second_title: "Aspose.Font pour C++"
description: "System::Collections::Generic::List::ConvertAll method. Crée une liste d'éléments convertis en un type différent en C++."
type: docs
weight: 1300
url: /fr/cpp/system.collections.generic/list/convertall/
---
## List::ConvertAll method


Crée une liste d'éléments convertis en un type différent.

```cpp
template<typename OutputType> SharedPtr<List<OutputType>> System::Collections::Generic::List<T>::ConvertAll(Converter<T, OutputType> converter)
```


| Paramètre | Description |
| --- | --- |
| OutputType | Type d'élément de la liste de sortie. |

| Paramètre | Type | Description |
| --- | --- | --- |
| converter | Converter\<T, OutputType\> | [Converter](../../../system/converter/) à utiliser pour la conversion des éléments. |

### ReturnValue

Une liste nouvellement créée d'éléments convertis.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../)
* Typedef [Converter](../../../system/converter/)
* Class [List](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
