---
title: Class EventTarget
second_title: Référence de l'API Aspose.SVG pour .NET
description: Aspose.Svg.Dom.EventTarget classe. LeEventTarget est implémentée par tous les nœuds dans une implémentation qui prend en charge le modèle dévénement DOM. Par conséquent cette interface peut être obtenue en utilisant des méthodes de conversion spécifiques à la liaison sur une instance de linterface de nœud. Linterface permet lenregistrement et la suppression des écouteurs dévénement sur unEventTarget et lenvoi dévénements à ceIEventTarget .
type: docs
weight: 870
url: /fr/net/aspose.svg.dom/eventtarget/
---
## EventTarget class

Le`EventTarget` est implémentée par tous les nœuds dans une implémentation qui prend en charge le modèle d'événement DOM. Par conséquent, cette interface peut être obtenue en utilisant des méthodes de conversion spécifiques à la liaison sur une instance de l'interface de nœud. L'interface permet l'enregistrement et la suppression des écouteurs d'événement sur un`EventTarget` et l'envoi d'événements à ce[`IEventTarget`](../../aspose.svg.dom.events/ieventtarget/) .

```csharp
public class EventTarget : DOMObject, IDisposable, IEventTarget
```

## Méthodes

| Nom | La description |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/#addeventlistener_1)(string, IEventListener) | Cette méthode permet l'enregistrement des écouteurs d'événement sur la cible de l'événement. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/#addeventlistener)(string, DOMEventHandler, bool) | Cette méthode permet l'enregistrement des écouteurs d'événement sur la cible de l'événement. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/#addeventlistener_2)(string, IEventListener, bool) | Cette méthode permet l'enregistrement des écouteurs d'événement sur la cible de l'événement. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(Event) | Cette méthode permet de répartir les événements dans le modèle d'événement des implémentations. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | Effectue des tâches définies par l'application associées à la libération, à la libération ou à la réinitialisation des ressources non gérées. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Cette méthode est utilisée pour récupérer l'objet ECMAScriptType . |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/#removeeventlistener_1)(string, IEventListener) | Cette méthode permet de supprimer les écouteurs d'événement de la cible de l'événement. Si un[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) est retiré d'un`EventTarget` pendant qu'il traite un événement, il ne sera pas déclenché par les actions en cours. Les écouteurs d'événement ne peuvent jamais être invoqués après avoir été supprimés. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/#removeeventlistener)(string, DOMEventHandler, bool) | Cette méthode permet de supprimer les écouteurs d'événement de la cible de l'événement. Si un[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) est retiré d'un`EventTarget` pendant qu'il traite un événement, il ne sera pas déclenché par les actions en cours. Les écouteurs d'événement ne peuvent jamais être invoqués après avoir été supprimés. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/#removeeventlistener_2)(string, IEventListener, bool) | Cette méthode permet de supprimer les écouteurs d'événement de la cible de l'événement. Si un[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) est retiré d'un`EventTarget` pendant qu'il traite un événement, il ne sera pas déclenché par les actions en cours. Les écouteurs d'événement ne peuvent jamais être invoqués après avoir été supprimés. |

### Voir également

* class [DOMObject](../domobject/)
* interface [IEventTarget](../../aspose.svg.dom.events/ieventtarget/)
* espace de noms [Aspose.Svg.Dom](../../aspose.svg.dom/)
* Assemblée [Aspose.SVG](../../)


