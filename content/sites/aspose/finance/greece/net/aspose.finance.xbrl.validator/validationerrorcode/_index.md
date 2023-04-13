---
title: Enum ValidationErrorCode
second_title: Aspose.Finance for .NET API Reference
description: Aspose.Finance.Xbrl.Validator.ValidationErrorCode αρίθμηση. Αριθμός κωδικού σφάλματος επικύρωσης.
type: docs
weight: 8210
url: /el/net/aspose.finance.xbrl.validator/validationerrorcode/
---
## ValidationErrorCode enumeration

Αριθμός κωδικού σφάλματος επικύρωσης.

```csharp
public enum ValidationErrorCode
```

### Αξίες

| Ονομα | αξία | Περιγραφή |
| --- | --- | --- |
| SchemaRefNoTypeSimple | `0` | Ο τύπος SchemaRef ΠΡΕΠΕΙ να εμφανίζεται και ΠΡΕΠΕΙ να έχει το σταθερό περιεχόμενο "απλό". |
| SchemaRefNoHref | `1` | SchemaRef ΠΡΕΠΕΙ να έχει χαρακτηριστικό href. |
| ContextNoId | `2` | Το αναγνωριστικό περιβάλλοντος ΠΡΕΠΕΙ να περιλαμβάνει το χαρακτηριστικό id. |
| ContextNoEntity | `3` | Το στοιχείο οντότητας είναι υποχρεωτικό περιεχόμενο του στοιχείου περιβάλλοντος. |
| ContextEntityNoIdentifier | `4` | Το στοιχείο οντότητας ΠΡΕΠΕΙ να περιέχει ένα αναγνωριστικό στοιχείο |
| ContextPeriodNoStartTime | `5` | Ο τύπος περοειδούς περιβάλλοντος είναι διάρκειας, αλλά δεν έχει ημερομηνία έναρξης. |
| ContextPeriodNoEndTime | `6` | Ο τύπος περοειδούς περιβάλλοντος είναι διάρκειας, αλλά δεν έχει ημερομηνία λήξης. |
| ContextPeriodStartAfterEnd | `7` | Ο τύπος περοειδούς περιβάλλοντος είναι διάρκεια, αλλά η ημερομηνία λήξης είναι πριν από την ημερομηνία έναρξης. |
| ContextInstantNoTime | `8` | Ο τύπος περοειδούς περιβάλλοντος είναι στιγμιαίος, αλλά δεν έχει άμεση ημερομηνία. |
| ContextScenarioXbrlNamespace | `9` | Το σενάριο περιβάλλοντος δεν μπορεί να έχει κόμβο χώρου ονομάτων xbrl. |
| ContextScenarioXbrlSubstitutionGroup | `10` | Το σενάριο περιβάλλοντος δεν μπορεί να έχει στοιχείο στην ομάδα αντικατάστασης για στοιχεία που ορίζονται στον χώρο ονομάτων xbrl. |
| ContextScenarioEmpty | `11` | Το σενάριο περιβάλλοντος δεν μπορεί να είναι κενό" |
| ContextSegmentXbrlNamespace | `12` | Το τμήμα περιβάλλοντος δεν μπορεί να έχει κόμβο χώρου ονομάτων xbrl. |
| ContextSegmentXbrlSubstitutionGroup | `13` | Το τμήμα περιβάλλοντος δεν μπορεί να έχει στοιχείο στην ομάδα αντικατάστασης για στοιχεία που ορίζονται στον χώρο ονομάτων xbrl. |
| ContextSegmentEmpty | `14` | Το τμήμα περιβάλλοντος δεν μπορεί να είναι κενό |
| ItemNoContext | `15` | Το στοιχείο πρέπει να έχει πλαίσιο. |
| ItemPeroidTypeConflictWithContext | `16` | Το στοιχείο έχει διένεξη τύπου περιόδου με το περιβάλλον. |
| ItemNumericNoUnit | `17` | Το στοιχείο είναι αριθμητικό και πρέπει να έχει μονάδα. |
| MonetaryItemNoSingleUnitMeasure | `18` | Το στοιχείο είναι νομισματικού τύπου και πρέπει να έχει ένα μέτρο μονάδας. |
| MonetaryItemNoISO4217 | `19` | Το στοιχείο είναι νομισματικού τύπου και πρέπει να έχει μέτρηση μονάδας στυλ Iso 4217. |
| ShareItemNoSingleUnitMeasure | `20` | Το στοιχείο είναι τύπος κοινής χρήσης και πρέπει να έχει ενιαία μέτρηση μονάδας. |
| ShareItemNoShareUnitMeasure | `21` | Το στοιχείο είναι τύπου κοινής χρήσης και πρέπει να έχει μέτρηση μονάδας xbrli:shares. |
| NillItemWithPrecisionOrDecimals | `22` | Το στοιχείο είναι μηδέν και δεν πρέπει να έχει ούτε ακρίβεια ούτε δεκαδικά. |
| FractionItemWithPrecisionOrDecimals | `23` | Το στοιχείο είναι τύπου κλάσματος και δεν πρέπει να έχει ούτε ακρίβεια ούτε δεκαδικά. |
| NumericItemWithBothPrecisionAndDecimals | `24` | Το στοιχείο είναι αριθμητικού τύπου και δεν πρέπει να έχει ακρίβεια και δεκαδικά ψηφία. |
| NumericItemWithoutPrecisionOrDecimals | `25` | Το στοιχείο είναι αριθμητικού τύπου και πρέπει να έχει ακρίβεια ή δεκαδικά. |
| NonNumericItemWithPrecisionOrDecimals | `26` | Το στοιχείο δεν είναι αριθμητικός τύπος και δεν πρέπει να έχει ούτε ακρίβεια ούτε δεκαδικά. |
| FootnoteArcFromNotFound | `27` | Δεν είναι δυνατή η εύρεση του τόξου της υποσημείωσης από το Loc. |
| FootnoteArcToNotFound | `28` | Το τόξο υποσημείωσης δεν είναι δυνατό να βρεθεί για υποσημείωση. |
| DefinitionArcFromNotFound | `29` | Δεν είναι δυνατή η εύρεση του τόξου ορισμού από το Loc. |
| DefinitionArcToNotFound | `30` | Το τόξο ορισμού δεν μπορεί να βρεθεί στο Loc. |
| EssenceAliasDefinitionArcDifferentType | `31` | Essence-alias Το τόξο ορισμού έχει διαφορετικούς τύπους. |
| EssenceAliasDefinitionArcDifferentPeriodType | `32` | Essence-alias Το τόξο ορισμού έχει διαφορετικούς τύπους περιόδου. |
| EssenceAliasDefinitionArcDifferentBalance | `33` | Essence-alias Ορισμός τόξου έχει διαφορετικές ισορροπίες. |
| CalculationArcFromNotFound | `34` | Δεν είναι δυνατή η εύρεση του τόξου υπολογισμού από το Loc. |
| CalculationArcToNotFound | `35` | Δεν είναι δυνατή η εύρεση του τόξου υπολογισμού στο Loc. |
| CalculationArcZeroWeight | `36` | Το τόξο υπολογισμού έχει μηδενικό βάρος. |
| CalculationArcSummationItemNonNumeric | `37` | Το τόξο υπολογισμού στοιχείων άθροισης έχει μη αριθμητική έννοια. |
| CalculationArcIllegalBalancecWeight | `38` | Το τόξο υπολογισμού στοιχείων άθροισης έχει μη αριθμητική έννοια. |
| LabelArcFromNotFound | `39` | Δεν είναι δυνατή η εύρεση του τόξου ετικέτας από το Loc. |
| LabelArcToNotFound | `40` | Δεν είναι δυνατή η εύρεση του τόξου ετικέτας στην ετικέτα. |
| PresentationArcFromNotFound | `41` | Δεν είναι δυνατή η εύρεση του τόξου παρουσίασης από το Loc. |
| PresentationArcToNotFound | `42` | Δεν είναι δυνατή η εύρεση του τόξου παρουσίασης στο Loc. |
| PresentationArcPreferredLabelNotFound | `43` | Το τόξο παρουσίασης δεν μπορεί να βρει την προτιμώμενη ετικέτα. |
| ReferenceArcFromNotFound | `44` | Δεν είναι δυνατή η εύρεση του τόξου αναφοράς από το Loc. |
| ReferenceArcToNotFound | `45` | Δεν είναι δυνατή η εύρεση του τόξου αναφοράς στην αναφορά. |
| InlineFactMissContext | `46` | Το Inline Fact δεν μπορεί να βρει το πλαίσιο. |
| InlineFactMissUnit | `47` | Το Inline Fact δεν μπορεί να βρει τη μονάδα. |
| InlineDuplicatedId | `48` | Το ενσωματωμένο έγγραφο Xbrl έχει διπλό αναγνωριστικό. |
| InlineRelationshipMissFromRef | `49` | Δεν είναι δυνατή η εύρεση της ενσωματωμένης σχέσης από την αναφ. |
| InlineRelationshipMissToRef | `50` | Δεν είναι δυνατή η εύρεση της εσωτερικής σχέσης για αναφορά. |
| InlineRelationshipIllegalFromRef | `51` | Η ενσωματωμένη σχέση είναι παράνομη από ref. |
| InlineRelationshipIllegalToRef | `52` | Η εσωτερική σχέση έχει παράνομη αναφορά. |
| InlineContinuationNotMatch | `53` | Η Inline Continuation έχει παράνομη αντιστοίχιση. |
| InlineFootnoteNotlang | `54` | Η ενσωματωμένη υποσημείωση δεν έχει γλώσσα. |
| InlineFractionIllegalChildElement | `55` | Το Inline Fraction έχει παράνομο παιδικό στοιχείο. |
| InlineFractionIllegalAttrbuites | `56` | Το Inline Fraction έχει παράνομα χαρακτηριστικά. |
| InlineFractionIllegalAncestor | `57` | Inline Fraction έχει παράνομο Ancestor. |
| InlineFractionTermNegative | `58` | Το κλάσμα ευθύγραμμου έχει αρνητικό όρο. |
| InlineHeaderIllegalAncestor | `59` | Το Inline Fraction έχει παράνομη ετικέτα. |
| InlineHeaderDisplayNone | `60` | Ενσωματωμένη κεφαλίδα πατέρας div κόμβος δεν έχει στυλ "display:none". |
| InlineHeaderIllegalChildElement | `61` | Η ενσωματωμένη κεφαλίδα έχει περισσότερα από ένα "κρυμμένα" στοιχεία ή περισσότερα από ένα στοιχεία "πόρους". |
| InlineNonFractionIllegalAncestor | `62` | Το ενσωματωμένο μη κλάσμα έχει παράνομο πρόγονο. |
| InlineNonFractionIllegalChildElement | `63` | Ενσωματωμένο non Fraction έχει παράνομο Child Elemnt. |
| InlineNonFractionIllegalProperties | `64` | Το Inline nonFraction έχει παράνομες ιδιότητες. |
| InlineNonFractionTermNegative | `65` | Το ενσωματωμένο μη κλάσμα έχει αρνητικό όρο. |
| InlineTupleIllegalChildElement | `66` | Η ενσωματωμένη πλειάδα έχει παράνομο στοιχείο. |
| InlineContinuationNoId | `67` | Το στοιχείο ix:continuation ΠΡΕΠΕΙ να έχει χαρακτηριστικό id.. |
| InlineContinuationIllegalAncestor | `68` | Το στοιχείο ix:continuation ΔΕΝ ΠΡΕΠΕΙ να είναι απόγονος ενός στοιχείου ix:hidden. |
| InlineExcludeIllegalAncestor | `69` | Το στοιχείο ix:exclude ΠΡΕΠΕΙ να είναι απόγονος τουλάχιστον ενός στοιχείου ix:continuation, ix:footnote ή ix:nonNumeric. |

### Δείτε επίσης

* χώρος ονομάτων [Aspose.Finance.Xbrl.Validator](../../aspose.finance.xbrl.validator/)
* συνέλευση [Aspose.Finance](../../)


