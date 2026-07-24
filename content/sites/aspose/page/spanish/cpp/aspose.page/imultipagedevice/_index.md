---
title: "Aspose::Page::IMultiPageDevice clase"
linktitle: "IMultiPageDevice"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::IMultiPageDevice clase. Esta interfaz contiene métodos para manipular dispositivos multipágina en C++."
type: docs
weight: 800
url: /es/cpp/aspose.page/imultipagedevice/
---
## IMultiPageDevice class


Esta interfaz contiene métodos para manipular dispositivos multipágina.

```cpp
class IMultiPageDevice : public virtual System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| virtual [ClosePage](./closepage/)() | Realiza la preparación necesaria del dispositivo después de que la página haya sido renderizada. |
| virtual [get_CurrentPageNumber](./get_currentpagenumber/)() | Número de página actual. |
| virtual [InitPageNumbers](./initpagenumbers/)() | Inicializa el número de páginas a generar. |
| virtual [OpenPage](./openpage/)(System::String) | Realiza la preparación necesaria del dispositivo antes del renderizado de la página. |
| virtual [OpenPage](./openpage/)(float, float) | Realiza la preparación necesaria del dispositivo antes del renderizado de cada página. |
| virtual [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) | Actualiza los parámetros de página desde otro dispositivo multipágina. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
