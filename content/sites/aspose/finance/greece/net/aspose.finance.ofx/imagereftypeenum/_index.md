---
title: Enum ImageRefTypeEnum
second_title: Aspose.Finance for .NET API Reference
description: Aspose.Finance.Ofx.ImageRefTypeEnum αρίθμηση. Αριθμός τύπου αναφοράς εικόνας.
type: docs
weight: 2320
url: /el/net/aspose.finance.ofx/imagereftypeenum/
---
## ImageRefTypeEnum enumeration

Αριθμός τύπου αναφοράς εικόνας.

```csharp
public enum ImageRefTypeEnum
```

### Αξίες

| Ονομα | αξία | Περιγραφή |
| --- | --- | --- |
| OPAQUE | `0` | Η πρόσβαση στην εικόνα γίνεται μέσω ενός ρητού OFX[`ImageRequest`](../../aspose.finance.ofx.image/imagerequest/) αίτημα, το οποίο θα ακολουθήσει τα δεδομένα εικόνας. |
| URL | `1` | Η πρόσβαση στην εικόνα γίνεται απευθείας μέσω της διεύθυνσης URL που παρέχεται. Δεν είναι δυνατή η ανάκτηση της εικόνας μέσω αιτήματος εικόνας OFX. Η προσδοκία είναι ότι ο πελάτης δεν θα παρέχει έλεγχο ταυτότητας και απλώς θα ακολουθήσει τη διεύθυνση URL που παρέχεται. |
| FORMURL | `2` | Η πρόσβαση στην εικόνα γίνεται απευθείας μέσω μιας κωδικοποιημένης διεύθυνσης URL. Δεν είναι δυνατή η ανάκτηση της εικόνας μέσω αιτήματος εικόνας OFX. Η προσδοκία είναι ότι ο πελάτης θα στείλει έλεγχο ταυτότητας στον διακομιστή. |

### Δείτε επίσης

* χώρος ονομάτων [Aspose.Finance.Ofx](../../aspose.finance.ofx/)
* συνέλευση [Aspose.Finance](../../)


