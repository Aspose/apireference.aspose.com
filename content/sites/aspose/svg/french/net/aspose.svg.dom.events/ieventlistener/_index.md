---
title: Interface IEventListener
second_title: Référence de l'API Aspose.SVG pour .NET
description: Aspose.Svg.Dom.Events.IEventListener interface. LeIEventListenerlinterface est la principale méthode de gestion des événements. Les utilisateurs implémententIEventListener interface et enregistrer son auditeur sur uneEventTarget en utilisant leAddEventListener method. Les utilisateurs doivent également supprimer leurIEventListener de sonEventTarget après avoir terminé dutiliser lécouteur.
type: docs
weight: 950
url: /fr/net/aspose.svg.dom.events/ieventlistener/
---
## IEventListener interface

Le`IEventListener`l'interface est la principale méthode de gestion des événements. Les utilisateurs implémentent`IEventListener` interface et enregistrer son auditeur sur une[`EventTarget`](../../aspose.svg.dom/eventtarget/) en utilisant le[`AddEventListener`](../../aspose.svg.dom/eventtarget/addeventlistener/) method. Les utilisateurs doivent également supprimer leur`IEventListener` de son[`EventTarget`](../../aspose.svg.dom/eventtarget/) après avoir terminé d'utiliser l'écouteur.

```csharp
public interface IEventListener
```

## Méthodes

| Nom | La description |
| --- | --- |
| [HandleEvent](../../aspose.svg.dom.events/ieventlistener/handleevent/)(Event) | Cette méthode est appelée chaque fois qu'un événement du type pour lequel le`IEventListener` l'interface a été enregistrée. |

### Remarques

Lorsqu'un nœud est copié à l'aide de la méthode cloneNode, les écouteurs d'événement attachés au nœud source ne sont pas attachés au nœud copié. Si l'utilisateur souhaite que les mêmes écouteurs d'événement soient ajoutés à la copie nouvellement créée, l'utilisateur doit les ajouter manuellement.

### Voir également

* espace de noms [Aspose.Svg.Dom.Events](../../aspose.svg.dom.events/)
* Assemblée [Aspose.SVG](../../)


