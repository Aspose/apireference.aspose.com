---
title: "Aspose::Page::UserProperties classe"
linktitle: "UserProperties"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::UserProperties classe. Classe di proprietà speciale che consente di impostare e restituire proprietà tipizzate. Consente inoltre di collegare due oggetti di proprietà predefiniti da cercare se questo oggetto di proprietà non contiene la proprietà in C++."
type: docs
weight: 1600
url: /it/cpp/aspose.page/userproperties/
---
## UserProperties class


Classe di proprietà speciale che consente di impostare e restituire proprietà tipizzate. Consente inoltre di collegare due oggetti di proprietà predefiniti da cercare se questo oggetto di proprietà non contiene la proprietà.

```cpp
class UserProperties : public System::Collections::Generic::Dictionary<System::String, System::SharedPtr<System::Object>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [GetProperty](./getproperty/)(System::String) | Ottiene il valore della proprietà stringa. |
| virtual [GetProperty](./getproperty/)(System::String, System::String) | Ottiene il valore della proprietà stringa. Se la proprietà richiesta è assente, restituisce il valore predefinito fornito. |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String) | Ottiene il valore della proprietà colore. |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String, System::Drawing::Color) | Ottiene il valore della proprietà colore. Se la proprietà richiesta è assente, restituisce il valore predefinito fornito. |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String) | Ottiene il valore della proprietà double. |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String, double) | Ottiene il valore della proprietà double. Se la proprietà richiesta è assente, restituisce il valore predefinito fornito. |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String) | Ottiene il valore della proprietà float. |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String, float) | Ottiene il valore della proprietà float. Se la proprietà richiesta è assente, restituisce il valore predefinito fornito. |
| virtual [GetPropertyInt](./getpropertyint/)(System::String) | Ottiene il valore della proprietà intera. |
| virtual [GetPropertyInt](./getpropertyint/)(System::String, int32_t) | Ottiene il valore della proprietà intera. Se la proprietà richiesta è assente, restituisce il valore predefinito fornito. |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String) | Ottiene il valore della proprietà margini. |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String, System::SharedPtr\<Margins\>) | Ottiene il valore della proprietà margini. Se la proprietà richiesta è assente, restituisce il valore predefinito fornito. |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String) | Ottiene il valore della proprietà matrice. |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Ottiene il valore della proprietà matrice. Se la proprietà richiesta è assente, restituisce il valore predefinito fornito. |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String) | Ottiene il valore della proprietà rettangolo. |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String, System::Drawing::RectangleF) | Ottiene il valore della proprietà rettangolo. Se la proprietà richiesta è assente, restituisce il valore predefinito fornito. |
| virtual [GetPropertySize](./getpropertysize/)(System::String) | Ottiene il valore della proprietà dimensione. |
| virtual [GetPropertySize](./getpropertysize/)(System::String, System::Drawing::Size) | Ottiene il valore della proprietà dimensione. Se la proprietà richiesta è assente, restituisce il valore predefinito fornito. |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String) | Ottiene il valore della proprietà array di stringhe. |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String, System::ArrayPtr\<System::String\>) | Ottiene il valore della proprietà array di stringhe. Se la proprietà richiesta è assente, restituisce il valore predefinito fornito. |
| virtual [IsProperty](./isproperty/)(System::String) | Ottiene il valore della proprietà booleana. |
| virtual [IsProperty](./isproperty/)(System::String, bool) | Ottiene il valore della proprietà booleana. Se la proprietà richiesta è assente, restituisce il valore predefinito fornito. |
| virtual [PrintProperties](./printproperties/)() |  |
| virtual [PropertyNames](./propertynames/)() | Restituisce i nomi delle proprietà. |
| virtual [set_Properties](./set_properties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Copia le proprietà, inclusi i suoi valori predefiniti, in questo [UserProperties](./). |
| virtual [SetProperty](./setproperty/)(System::String, System::String) | Imposta il valore della proprietà stringa. |
| virtual [SetProperty](./setproperty/)(System::String, System::ArrayPtr\<System::String\>) | Imposta il valore della proprietà array di stringhe. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::ArrayPtr\<System::String\>) | Imposta il valore della proprietà array di stringhe nella tabella delle proprietà specificata. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Color) | Imposta il valore della proprietà colore. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Color) | Imposta il valore della proprietà colore nella tabella delle proprietà specificata. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Rectangle) | Imposta il valore della proprietà rettangolo. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Rectangle) | Imposta il valore della proprietà rettangolo nella tabella delle proprietà specificata. |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<Margins\>) | Imposta il valore della proprietà margini. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<Margins\>) | Imposta il valore della proprietà margini nella tabella delle proprietà specificata. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Size) | Imposta il valore della proprietà dimensione. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Size) | Imposta il valore della proprietà dimensione nella tabella delle proprietà specificata. |
| virtual [SetProperty](./setproperty/)(System::String, int32_t) | Imposta il valore della proprietà intero. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, int32_t) | Imposta il valore della proprietà intero nella tabella delle proprietà specificata. |
| virtual [SetProperty](./setproperty/)(System::String, double) | Imposta il valore della proprietà double. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, double) | Imposta il valore della proprietà double nella tabella delle proprietà specificata. |
| virtual [SetProperty](./setproperty/)(System::String, float) | Imposta il valore della proprietà float. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, float) | Imposta il valore della proprietà float nella tabella delle proprietà specificata. |
| virtual [SetProperty](./setproperty/)(System::String, bool) | Imposta il valore della proprietà booleano. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, bool) | Imposta il valore della proprietà booleano nella tabella delle proprietà specificata. |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Imposta il valore della proprietà matrice. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Imposta il valore della proprietà matrice nella tabella delle proprietà specificata. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Imposta il n‑esimo argomento del modello come puntatore debole (anziché condiviso). Consente di cambiare i puntatori nei contenitori in modalità debole. |
| [UserProperties](./userproperties/)() | Inizializza un'istanza vuota della classe [UserProperties](./). |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Inizializza un'istanza della classe [UserProperties](./) con valori predefiniti. |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Costruisce [UserProperties](./) con una tabella defaults e altDefaults, che vengono cercate in quest'ordine. |
## Vedi anche

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
