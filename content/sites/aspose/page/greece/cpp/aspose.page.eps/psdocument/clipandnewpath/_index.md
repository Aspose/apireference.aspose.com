---
title: "Aspose::Page::EPS::PsDocument::ClipAndNewPath method"
linktitle: "ClipAndNewPath"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::EPS::PsDocument::ClipAndNewPath method. Προσθέτει αποκοπή στην τρέχουσα κατάσταση γραφικών και στη συνέχεια γράφει τον τελεστή \"newpath\". Είναι απαραίτητο να γίνει για να αποφευχθεί η σύγκρουση αυτής της διαδρομής αποκοπής με κάποιες επόμενες διαδρομές, όπως τα γλύφοι που περιγράφονται με τον τελεστή \"charpath\" σε C++."
type: docs
weight: 300
url: /el/cpp/aspose.page.eps/psdocument/clipandnewpath/
---
## PsDocument::ClipAndNewPath method


Προσθέτει αποκοπή στην τρέχουσα κατάσταση γραφικών και στη συνέχεια γράφει τον τελεστή "newpath". Είναι απαραίτητο για την αποφυγή σύγκρουσης αυτής της διαδρομής αποκοπής με κάποιες επόμενες διαδρομές όπως τα γλύφοι που περιγράφονται με τον τελεστή "charpath".

```cpp
void Aspose::Page::EPS::PsDocument::ClipAndNewPath(System::SharedPtr<System::Drawing::Drawing2D::GraphicsPath> s)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| s | System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\> | Η διαδρομή αποκοπής. |

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GraphicsPath](../../../system.drawing.drawing2d/graphicspath/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
