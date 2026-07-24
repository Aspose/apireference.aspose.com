---
title: "Aspose::Page::EPS::Util::ThreadLocal classe"
linktitle: "ThreadLocal"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::EPS::Util::ThreadLocal classe. Classe utilisée pour dupliquer la fonctionnalité fournie par le type d'enveloppe System.Threading.ThreadLocal du .NET Framework 4.0 et 4.5''. Cela implémente des types d'instance et statiques qui sont locaux aux threads et font référence à différentes instances à travers les threads, même si le type d'instance réel dont la classe est un agrégat peut être le même en C++."
type: docs
weight: 100
url: /fr/cpp/aspose.page.eps.util/threadlocal/
---
## ThreadLocal class


Classe utilisée pour dupliquer la fonctionnalité fournie par le type d'enveloppe System.Threading.ThreadLocal du .NET Framework 4.0 et 4.5. Elle implémente des types d'instance et statiques qui sont locaux au thread et font référence à des instances différentes selon les threads, même si le type d'instance réel dont la classe est une agrégation peut être le même.

```cpp
template<typename T>class ThreadLocal : public System::IDisposable
```


| Paramètre | Description |
| --- | --- |
| T | Type de variable à encapsuler dans la logique de sélection de thread |
## Méthodes

| Méthode | Description |
| --- | --- |
| [Dispose](./dispose/)() override | Ne fait rien. |
| [get_Value](./get_value/)() |  |
| [isValueCreated](./isvaluecreated/)() |  |
| [set_Value](./set_value/)(T) |  |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Définit le n-ième argument de modèle comme un pointeur faible (plutôt que partagé). Permet de basculer les pointeurs dans les conteneurs en mode faible. |
| [ThreadLocal](./threadlocal/)(Factory) |  |
| static [to_T](./to_t/)(System::SharedPtr\<ThreadLocal\<T\>\>) |  |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Factory](./factory/) |  |

## Voir aussi

* Class [IDisposable](../../system/idisposable/)
* Namespace [Aspose::Page::EPS::Util](../)
* Library [Aspose.Page for C++](../../)
