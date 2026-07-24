---
title: "System::Drawing::Drawing2D::CustomLineCap::CustomLineCap costruttore"
linktitle: "CustomLineCap"
second_title: "Aspose.Page per C++"
description: "System::Drawing::Drawing2D::CustomLineCap::CustomLineCap costruttore. Crea una nuova istanza della classe CustomLineCap che rappresenta un cap di linea definito dall'utente con le proprietà specificate in C++."
type: docs
weight: 100
url: /it/cpp/system.drawing.drawing2d/customlinecap/customlinecap/
---
## CustomLineCap::CustomLineCap constructor


Crea una nuova istanza della classe [CustomLineCap](../) che rappresenta un cap di linea definito dall'utente con le proprietà specificate.

```cpp
System::Drawing::Drawing2D::CustomLineCap::CustomLineCap(const SharedPtr<GraphicsPath> &fillPath, const SharedPtr<GraphicsPath> &strokePath, LineCap baseCap=LineCap::Flat, float baseInset=0)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fillPath | const SharedPtr\<GraphicsPath\>\& | Specifica un riempimento per il cap personalizzato |
| strokePath | const SharedPtr\<GraphicsPath\>\& | Specifica un contorno del cap personalizzato |
| baseCap | LineCap | Il cap di linea base da cui viene creato il cap personalizzato |
| baseInset | float | Specifica la distanza tra la linea e il cap |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GraphicsPath](../../graphicspath/)
* Enum [LineCap](../../linecap/)
* Class [CustomLineCap](../)
* Namespace [System::Drawing::Drawing2D](../../)
* Library [Aspose.Page for C++](../../../)
