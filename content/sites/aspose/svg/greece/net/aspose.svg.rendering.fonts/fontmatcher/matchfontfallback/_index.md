---
title: FontMatcher.MatchFontFallback
second_title: Aspose.SVG για Αναφορά API .NET
description: FontMatcher μέθοδος. Αυτή η μέθοδος καλείται εάν δεν υπάρχει κατάλληλη γραμματοσειρά στους φακέλους αναζήτησης γραμματοσειρών. Θα πρέπει να επιστρέψει γραμματοσειρά αληθινού τύπου με βάση τοfontMatchingProperties που μπορεί να αποδώσειcharCode  ήμηδενικό εάν αυτή η γραμματοσειρά δεν είναι διαθέσιμη.
type: docs
weight: 10
url: /el/net/aspose.svg.rendering.fonts/fontmatcher/matchfontfallback/
---
## FontMatcher.MatchFontFallback method

Αυτή η μέθοδος καλείται εάν δεν υπάρχει κατάλληλη γραμματοσειρά στους φακέλους αναζήτησης γραμματοσειρών. Θα πρέπει να επιστρέψει γραμματοσειρά αληθινού τύπου με βάση το*fontMatchingProperties* που μπορεί να αποδώσει*charCode* , ή`μηδενικό` εάν αυτή η γραμματοσειρά δεν είναι διαθέσιμη.

```csharp
public abstract byte[] MatchFontFallback(FontMatchingProperties fontMatchingProperties, 
    uint charCode)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| fontMatchingProperties | FontMatchingProperties | Ιδιότητες της αντιστοιχισμένης γραμματοσειράς. |
| charCode | UInt32 | Κωδικός του χαρακτήρα που θα αποδοθεί χρησιμοποιώντας την αντίστοιχη γραμματοσειρά. |

### Επιστρεφόμενη Αξία

Ένας πίνακας byte που περιέχει τα δεδομένα γραμματοσειρών ή`μηδενικό`.

### Δείτε επίσης

* class [FontMatchingProperties](../../fontmatchingproperties/)
* class [FontMatcher](../)
* χώρος ονομάτων [Aspose.Svg.Rendering.Fonts](../../fontmatcher/)
* συνέλευση [Aspose.SVG](../../../)


