---
title: "Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs classe"
linktitle: "BeforeSavingEventArgs"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs classe. Définit la classe de base pour les arguments de divers événements avant l'enregistrement en C++."
type: docs
weight: 200
url: /fr/cpp/aspose.page.xps.features.eventbasedmodifications/beforesavingeventargs/
---
## BeforeSavingEventArgs class


Définit la classe de base pour les arguments de divers événements avant l'enregistrement.

```cpp
template<typename T>class BeforeSavingEventArgs : public System::Object
```


| Paramètre | Description |
| --- | --- |
| T | Le type d'API de modification. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [get_AbsolutePageNumber](./get_absolutepagenumber/)() const | Le numéro de page absolu actuel à travers tous les documents du paquet [XPS](../../aspose.page.xps/). |
| [get_DocumentNumber](./get_documentnumber/)() const | Le numéro de document actuel dans le paquet [XPS](../../aspose.page.xps/). |
| [get_ElementAPI](./get_elementapi/)() const | Obtient l'API de modification de l'élément qui est sur le point d'être enregistré. |
| [get_OutputPageNumber](./get_outputpagenumber/)() const | Le numéro de sortie actuel. Il diffère de **AbsolutePageNumber** si l'option de sauvegarde **PageNumbers** est spécifiée. |
| [get_RelativePageNumber](./get_relativepagenumber/)() const | Le numéro de page actuel relatif au document actuel dans le paquet [XPS](../../aspose.page.xps/). |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Définit le n-ième argument de modèle comme un pointeur faible (plutôt que partagé). Permet de basculer les pointeurs dans les conteneurs en mode faible. |

## Voir aussi

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
