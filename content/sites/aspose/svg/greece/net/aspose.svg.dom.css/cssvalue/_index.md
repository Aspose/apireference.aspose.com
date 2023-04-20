---
title: Class CSSValue
second_title: Aspose.SVG για Αναφορά API .NET
description: Aspose.Svg.Dom.Css.CSSValue τάξη. Αντιπροσωπεύει μια απλή ή μια σύνθετη τιμή. Ένα αντικείμενο CSSValue εμφανίζεται μόνο σε ένα περιβάλλον μιας ιδιότητας CSS.
type: docs
weight: 490
url: /el/net/aspose.svg.dom.css/cssvalue/
---
## CSSValue class

Αντιπροσωπεύει μια απλή ή μια σύνθετη τιμή. Ένα αντικείμενο CSSValue εμφανίζεται μόνο σε ένα περιβάλλον μιας ιδιότητας CSS.

```csharp
public abstract class CSSValue : DOMObject
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| abstract [CSSText](../../aspose.svg.dom.css/cssvalue/csstext/) { get; set; } | Αναπαράσταση συμβολοσειράς της τρέχουσας τιμής. |
| [CSSValueType](../../aspose.svg.dom.css/cssvalue/cssvaluetype/) { get; } | Ένας κωδικός που καθορίζει τον τύπο της τιμής. |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| override [Equals](../../aspose.svg.dom.css/cssvalue/equals/)(object) | Καθορίζει εάν το καθορισμένοObject ισούται με αυτήν την περίπτωση. |
| override [GetHashCode](../../aspose.svg.dom.css/cssvalue/gethashcode/)() | Επιστρέφει έναν κωδικό κατακερματισμού για αυτήν την εμφάνιση. |
| override [GetPlatformType](../../aspose.svg.dom.css/cssvalue/getplatformtype/)() | Αυτή η μέθοδος χρησιμοποιείται για την ανάκτηση αντικειμένου ECMAScriptType . |
| override [ToString](../../aspose.svg.dom.css/cssvalue/tostring/)() | Επιστρέφει αString που αντιπροσωπεύει αυτήν την περίπτωση. |
| [operator ==](../../aspose.svg.dom.css/cssvalue/op_equality/) | Υλοποιεί τον τελεστή ==. |
| [operator !=](../../aspose.svg.dom.css/cssvalue/op_inequality/) | Υλοποιεί τον τελεστή !=. |

## Πεδία

| Ονομα | Περιγραφή |
| --- | --- |
| const [CSS_CUSTOM](../../aspose.svg.dom.css/cssvalue/css_custom/) | Η τιμή είναι προσαρμοσμένη τιμή. |
| const [CSS_INHERIT](../../aspose.svg.dom.css/cssvalue/css_inherit/) | Η τιμή κληρονομείται και το cssText περιέχει "inherit". |
| const [CSS_PRIMITIVE_VALUE](../../aspose.svg.dom.css/cssvalue/css_primitive_value/) | Η τιμή είναι μια πρωταρχική τιμή και μια παρουσία της διεπαφής CSSPrimitiveValue μπορεί να ληφθεί χρησιμοποιώντας μεθόδους casting ειδικά για δέσμευση σε αυτήν την παρουσία της διεπαφής CSSValue. |
| const [CSS_VALUE_LIST](../../aspose.svg.dom.css/cssvalue/css_value_list/) | Η τιμή είναι μια λίστα CSSValue και μια παρουσία της διεπαφής CSSValueList μπορεί να ληφθεί χρησιμοποιώντας μεθόδους casting ειδικά για δέσμευση σε αυτήν την παρουσία της διεπαφής CSSValue. |

### Δείτε επίσης

* class [DOMObject](../../aspose.svg.dom/domobject/)
* χώρος ονομάτων [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* συνέλευση [Aspose.SVG](../../)


