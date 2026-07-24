---
title: "System::Net::Cache::HttpCacheAgeControl перечисление"
linktitle: "HttpCacheAgeControl"
second_title: "Aspose.Page для C++"
description: "System::Net::Cache::HttpCacheAgeControl перечисление. CacheAgeControl используется для указания предпочтений относительно возраста и актуальности кэшированных элементов в C++."
type: docs
weight: 300
url: /ru/cpp/system.net.cache/httpcacheagecontrol/
---
## HttpCacheAgeControl enum


CacheAgeControl используется для указания предпочтений относительно возраста кэшированного элемента и его актуальности.

```cpp
enum class HttpCacheAgeControl
```

### Значения

| Имя | Значение | Описание |
| --- | --- | --- |
| None | 0 | Только для внутреннего использования. |
| MinFresh | 1 | Содержимое может быть получено из кэша, если оставшееся время до истечения срока действия больше или равно времени, указанному этим значением. |
| MaxAge | 2 | Содержимое может быть получено из кэша, пока оно не станет старше возраста, указанного этим значением. |
| MaxStale | 4 | Содержимое может быть получено из кэша после истечения срока, пока не пройдет время, указанное этим значением. |
| MaxAgeAndMinFresh | 3 | MaxAge и MinFresh. |
| MaxAgeAndMaxStale | 6 | MaxAge и MaxStale. |

## См. также

* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
