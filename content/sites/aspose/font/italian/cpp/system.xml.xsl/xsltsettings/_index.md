---
title: "System::Xml::Xsl::XsltSettings classe"
linktitle: "XsltSettings"
second_title: "Aspose.Font per C++"
description: "System::Xml::Xsl::XsltSettings classe. Specifica le funzionalità XSLT da supportare durante l'esecuzione del foglio di stile XSLT in C++."
type: docs
weight: 800
url: /it/cpp/system.xml.xsl/xsltsettings/
---
## XsltSettings class


Specifica le funzionalità XSLT da supportare durante l'esecuzione del foglio di stile XSLT.

```cpp
class XsltSettings : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [get_Default](./get_default/)() | Restituisce un oggetto [XsltSettings](./) con le impostazioni predefinite. Il supporto per la funzione XSLT **document()** e per i blocchi di script incorporati è disabilitato. |
| [get_EnableDocumentFunction](./get_enabledocumentfunction/)() | Restituisce un valore che indica se abilitare il supporto per la funzione XSLT **document()**. |
| [get_EnableScript](./get_enablescript/)() | Restituisce un valore che indica se abilitare il supporto per i blocchi di script incorporati. |
| static [get_TrustedXslt](./get_trustedxslt/)() | Restituisce un oggetto [XsltSettings](./) che abilita il supporto per la funzione XSLT **document()** e per i blocchi di script incorporati. |
| [set_EnableDocumentFunction](./set_enabledocumentfunction/)(bool) | Imposta un valore che indica se abilitare il supporto per la funzione XSLT **document()**. |
| [set_EnableScript](./set_enablescript/)(bool) | Imposta un valore che indica se abilitare il supporto per i blocchi di script incorporati. |
| [XsltSettings](./xsltsettings/)() | Inizializza una nuova istanza della classe [XsltSettings](./) con le impostazioni predefinite. |
| [XsltSettings](./xsltsettings/)(bool, bool) | Inizializza una nuova istanza della classe [XsltSettings](./) con le impostazioni specificate. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
