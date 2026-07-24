---
title: "Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption κλάση"
linktitle: "PageDeviceColorSpaceUsageOption"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption κλάση. Περιγράφει τις επιλογές χαρακτηριστικού PageDeviceColorSpaceUsage σε C++."
type: docs
weight: 200
url: /el/cpp/aspose.page.xps.xpsmetadata/pagedevicecolorspaceusage/pagedevicecolorspaceusageoption/
---
## PageDeviceColorSpaceUsageOption class


Περιγράφει τις επιλογές χαρακτηριστικού [PageDeviceColorSpaceUsage](../).

```cpp
class PageDeviceColorSpaceUsageOption : public Aspose::Page::XPS::XpsMetadata::Option
```

## Πεδία

| Πεδίο | Περιγραφή |
| --- | --- |
| static [MatchToDefault](./matchtodefault/) | Εάν η συσκευή καθορίσει ότι το προφίλ που καθορίζεται από την παράμετρο [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) μπορεί να χρησιμοποιηθεί ως προφίλ χρωματικού χώρου της συσκευής, όλα τα στοιχεία που χρησιμοποιούν το ίδιο προφίλ θεωρούνται ότι έχουν ήδη καθοριστεί σε χρωματικό χώρο της συσκευής. Όλα τα άλλα στοιχεία MUST να χρησιμοποιούν το προφίλ που καθορίζεται για εκείνο το στοιχείο. Εάν το προφίλ δεν μπορεί να χρησιμοποιηθεί ως προφίλ χρωματικού χώρου της συσκευής, τα στοιχεία που χρησιμοποιούν το προφίλ MUST να διαχειρίζονται χρωματικά όπως οποιοδήποτε άλλο στοιχείο που χρησιμοποιεί το χρωματικό προφίλ. |
| static [OverrideDeviceDefault](./overridedevicedefault/) | Εάν το προφίλ που καθορίζεται από την παράμετρο [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) έχει αριθμό καναλιών που ταιριάζει με τον αριθμό πρωτογενών της συσκευής, θα SHOULD χρησιμοποιηθεί αντί της εσωτερικής διαχείρισης χρώματος της συσκευής για όλα τα στοιχεία. Τα στοιχεία που χρησιμοποιούν αυτό το προφίλ θεωρούνται ότι βρίσκονται σε χρωματικό χώρο της συσκευής και δεν θα υποβληθούν σε περαιτέρω διαχείριση χρώματος. |
## Δείτε επίσης

* Class [Option](../../option/)
* Class [PageDeviceColorSpaceUsage](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
