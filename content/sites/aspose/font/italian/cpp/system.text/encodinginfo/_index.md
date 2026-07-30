---
title: "System::Text::EncodingInfo classe"
linktitle: "EncodingInfo"
second_title: "Aspose.Font per C++"
description: "System::Text::EncodingInfo classe. Breve informazione sulla codifica. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 1900
url: /it/cpp/system.text/encodinginfo/
---
## EncodingInfo class


Breve informazione sulla codifica. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
class EncodingInfo : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [EncodingInfo](./encodinginfo/)(int, const String\&, const String\&) | Costruttore. |
| [get_CodePage](./get_codepage/)() const | Restituisce l'ID della pagina di codice. |
| [get_DisplayName](./get_displayname/)() const | Restituisce il nome completo della codifica localizzata. |
| [get_Name](./get_name/)() const | Restituisce il nome breve della codifica. |
| [GetEncoding](./getencoding/)() | Restituisce la codifica descritta dalle informazioni. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
