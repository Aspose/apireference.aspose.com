---
title: "Aspose::Font::MultiLanguageString classe"
linktitle: "MultiLanguageString"
second_title: "Aspose.Font per C++"
description: "Aspose::Font::MultiLanguageString classe. Rappresenta una stringa multilingua in C++."
type: docs
weight: 2800
url: /it/cpp/aspose.font/multilanguagestring/
---
## MultiLanguageString class


Rappresenta una stringa multilingua.

```cpp
class MultiLanguageString : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AddLanguageString](./addlanguagestring/)(System::String, int32_t) | Aggiunge una stringa di una lingua specifica. |
| [ContainsString](./containsstring/)(System::String) | Restituisce true se la stringa è presente in tutte le stringhe delle lingue. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Restituisce true se gli oggetti sono considerati uguali. |
| [get_IsEmpty](./get_isempty/)() | True, se [MultiLanguageString](./) non ha stringhe di lingue. |
| [GetAllLanguageIds](./getalllanguageids/)() | Ottiene gli identificatori di lingua per tutte le stringhe o un array vuoto se non sono presenti stringhe. |
| [GetAllStrings](./getallstrings/)() | Restituisce tutte le stringhe di tutte le lingue. |
| [GetEnglishString](./getenglishstring/)() | Restituisce la stringa inglese se trovata. Altrimenti restituisce la prima stringa non inglese. |
| [GetHashCode](./gethashcode/)() const override | Implementazione di GetHashCode. |
| [GetStringForLanguageId](./getstringforlanguageid/)(int32_t) | Restituisce la stringa relativa all'identificatore di lingua fornito, se trovata. Stringa vuota altrimenti. |
| [MultiLanguageString](./multilanguagestring/)() | Crea una stringa multilingua vuota. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
