---
title: Class MutationRecord
second_title: Aspose.SVG για Αναφορά API .NET
description: Aspose.Svg.Dom.Mutations.MutationRecord τάξη. Ένα MutationRecord αντιπροσωπεύει μια μεμονωμένη μετάλλαξη DOM. Είναι το αντικείμενο στο οποίο μεταβιβάζεταιMutationObserver μικρόMutationCallback .
type: docs
weight: 1140
url: /el/net/aspose.svg.dom.mutations/mutationrecord/
---
## MutationRecord class

Ένα MutationRecord αντιπροσωπεύει μια μεμονωμένη μετάλλαξη DOM. Είναι το αντικείμενο στο οποίο μεταβιβάζεται[`MutationObserver`](../mutationobserver/) μικρό[`MutationCallback`](../mutationcallback/) .

```csharp
public class MutationRecord : DOMObject
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [AddedNodes](../../aspose.svg.dom.mutations/mutationrecord/addednodes/) { get; } | Επιστρέψτε τους κόμβους που προστέθηκαν. |
| [AttributeName](../../aspose.svg.dom.mutations/mutationrecord/attributename/) { get; } | Επιστρέφει το τοπικό όνομα του αλλαγμένου χαρακτηριστικού και μηδενίζει διαφορετικά. |
| [AttributeNamespace](../../aspose.svg.dom.mutations/mutationrecord/attributenamespace/) { get; } | Επιστρέφει τον χώρο ονομάτων του αλλαγμένου χαρακτηριστικού και μηδενίζει διαφορετικά. |
| [NextSibling](../../aspose.svg.dom.mutations/mutationrecord/nextsibling/) { get; } | Επιστρέψτε τον επόμενο αδερφό των κόμβων που προστέθηκαν ή αφαιρέθηκαν ή null. |
| [OldValue](../../aspose.svg.dom.mutations/mutationrecord/oldvalue/) { get; } | Η τιμή επιστροφής εξαρτάται από τον τύπο. Για "χαρακτηριστικά", είναι η τιμή του αλλαγμένου χαρακτηριστικού πριν από την αλλαγή. Για "characterData", είναι τα δεδομένα του αλλαγμένου κόμβου πριν από την αλλαγή. Για "childList", είναι null. |
| [PreviousSibling](../../aspose.svg.dom.mutations/mutationrecord/previoussibling/) { get; } | Επιστρέφει τον προηγούμενο αδελφό των κόμβων που προστέθηκαν ή αφαιρέθηκαν ή null. |
| [RemovedNodes](../../aspose.svg.dom.mutations/mutationrecord/removednodes/) { get; } | Επιστρέψτε τους κόμβους που αφαιρέθηκαν. |
| [Target](../../aspose.svg.dom.mutations/mutationrecord/target/) { get; } | Επιστρέφει τον κόμβο που επηρεάστηκε η μετάλλαξη, ανάλογα με τον τύπο. Για τα "χαρακτηριστικά", είναι το στοιχείο του οποίου το χαρακτηριστικό άλλαξε. Για το "characterData", είναι ο κόμβος CharacterData. Για το "childList", είναι ο κόμβος του οποίου άλλαξαν τα παιδιά. |
| [Type](../../aspose.svg.dom.mutations/mutationrecord/type/) { get; } | Επιστρέφει "χαρακτηριστικά" εάν ήταν μετάλλαξη χαρακτηριστικών, "characterData" εάν ήταν μετάλλαξη σε κόμβο CharacterData και "childList" εάν ήταν μετάλλαξη στο δέντρο των κόμβων. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Αυτή η μέθοδος χρησιμοποιείται για την ανάκτηση αντικειμένου ECMAScriptType . |

### Δείτε επίσης

* class [DOMObject](../../aspose.svg.dom/domobject/)
* χώρος ονομάτων [Aspose.Svg.Dom.Mutations](../../aspose.svg.dom.mutations/)
* συνέλευση [Aspose.SVG](../../)


