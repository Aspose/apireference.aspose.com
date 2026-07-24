---
title: "Aspose::Page::IMultiPageDevice sınıfı"
linktitle: "IMultiPageDevice"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::IMultiPageDevice sınıfı. Bu arayüz, C++'da çok sayfalı cihazı manipüle etmek için yöntemler içerir."
type: docs
weight: 800
url: /tr/cpp/aspose.page/imultipagedevice/
---
## IMultiPageDevice class


Bu arayüz, çok sayfalı cihazı manipüle etmek için yöntemler içerir.

```cpp
class IMultiPageDevice : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [ClosePage](./closepage/)() | Sayfa render edildikten sonra cihazın gerekli hazırlığını yapar. |
| virtual [get_CurrentPageNumber](./get_currentpagenumber/)() | Geçerli sayfa numarası. |
| virtual [InitPageNumbers](./initpagenumbers/)() | Çıktı sayfa sayısını başlatır. |
| virtual [OpenPage](./openpage/)(System::String) | Sayfa işlenmesinden önce cihazın gerekli hazırlığını yapar. |
| virtual [OpenPage](./openpage/)(float, float) | Her sayfa işlenmesinden önce cihazın gerekli hazırlığını yapar. |
| virtual [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) | Diğer çok sayfalı cihazdan sayfa parametrelerini günceller. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
