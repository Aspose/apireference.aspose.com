---
title: "System::Drawing::ImageConverter classe"
linktitle: "ImageConverter"
second_title: "Aspose.Font per C++"
description: "System::Drawing::ImageConverter classe. Converte gli oggetti Image da un tipo di dati a un altro. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1300
url: /it/cpp/system.drawing/imageconverter/
---
## ImageConverter class


Converte gli oggetti [Image](../image/) da un tipo di dati a un altro. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class ImageConverter : public System::ComponentModel::TypeConverter
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::ComponentModel::ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) override | Converte l'oggetto in un tipo specifico. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | Converte l'oggetto in un tipo specifico. |
| [ImageConverter](./imageconverter/)() | Crea una nuova istanza di [ImageConverter](./). |
## Vedi anche

* Class [TypeConverter](../../system.componentmodel/typeconverter/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)
