---
title: "Метод System::Array::ConstrainedCopy"
linktitle: "ConstrainedCopy"
second_title: "Aspose.Font для C++"
description: "Метод System::Array::ConstrainedCopy. Копирует диапазон элементов из объекта System.Array, начиная с указанного источника, в C++."
type: docs
weight: 4700
url: /ru/cpp/system/array/constrainedcopy/
---
## Array::ConstrainedCopy method


Копирует диапазон элементов из [System.Array](../), начиная с указанного источника.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::ConstrainedCopy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| Параметр | Описание |
| --- | --- |
| SrcType | Тип элементов в исходном массиве |
| DstType | Тип элементов в целевом массиве |

| Параметр | Тип | Описание |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Исходный массив |
| srcIndex | int64_t | Индекс в исходном массиве, указывающий начало диапазона копируемых элементов |
| dstArray | const ArrayPtr\<DstType\>\& | Целевой массив |
| dstIndex | int64_t | Индекс в целевом массиве, с которого начинается вставка скопированных элементов |
| count | int64_t | Количество элементов для копирования |
## Примечания


ВРЕМЕННАЯ НЕОБРАБОТАННАЯ РЕАЛИЗАЦИЯ БЕЗ КАКИХ-ЛИБО ДОПОЛНЕНИЙ!
## См. также

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
