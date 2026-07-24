---
title: "System::Array::ConstrainedCopy yöntemi"
linktitle: "ConstrainedCopy"
second_title: "Aspose.Page için C++"
description: "System::Array::ConstrainedCopy yöntemi. Belirtilen kaynaktan başlayarak bir System.Array içindeki öğe aralığını C++'ta kopyalar."
type: docs
weight: 4700
url: /tr/cpp/system/array/constrainedcopy/
---
## Array::ConstrainedCopy method


Belirtilen kaynaktan başlayarak bir [System.Array](../) içindeki öğe aralığını kopyalar.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::ConstrainedCopy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | Açıklama |
| --- | --- |
| SrcType | Kaynak dizideki öğelerin türü |
| DstType | Hedef dizideki öğelerin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Kaynak dizi |
| srcIndex | int64_t | Kaynak dizide kopyalanacak öğe aralığının başlangıcını belirten indeks |
| dstArray | const ArrayPtr\<DstType\>\& | Hedef dizi |
| dstIndex | int64_t | Kopyalanan öğelerin eklenmeye başlanacağı hedef dizideki indeks |
| count | int64_t | Kopyalanacak öğe sayısı |
## Açıklamalar


GEÇİCİ HAM UYGULAMA, HİÇBİR DÜZELTMEN YOK!
## Ayrıca Bakınız

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
