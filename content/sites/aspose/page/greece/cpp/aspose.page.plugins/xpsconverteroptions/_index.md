---
title: "Aspose::Page::Plugins::XpsConverterOptions κλάση"
linktitle: "XpsConverterOptions"
second_title: "Aspose.Page για C++"
description: "Aspose::Page::Plugins::XpsConverterOptions κλάση. Αναπαριστά τις επιλογές για το πρόσθετο XpsConverter σε C++."
type: docs
weight: 2000
url: /el/cpp/aspose.page.plugins/xpsconverteroptions/
---
## XpsConverterOptions class


Αναπαριστά τις επιλογές για το πρόσθετο [XpsConverter](../xpsconverter/).

```cpp
class XpsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                            public Aspose::Page::Plugins::IDataContainer,
                            public Aspose::Page::Plugins::ISaveInstruction
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | Προσθέτει νέα πηγή δεδομένων στη συλλογή δεδομένων του πρόσθετου [XpsConverter](../xpsconverter/). |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | Προσθέτει νέα πηγή δεδομένων στη συλλογή δεδομένων του πρόσθετου [XpsConverterOptions](./). |
| [get_DataCollection](./get_datacollection/)() override | Επιστρέφει τη συλλογή δεδομένων του πρόσθετου [XpsConverterOptions](./). |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | Η κατηγορία Ποιότητα καθορίζει το επίπεδο συμπίεσης για μια εικόνα. Οι διαθέσιμες τιμές είναι από 0 έως 100. Όσο μικρότερος είναι ο αριθμός που καθορίζεται, τόσο μεγαλύτερη είναι η συμπίεση και, κατά συνέπεια, τόσο χαμηλότερη η ποιότητα της εικόνας. Η τιμή 0 οδηγεί στην εικόνα χαμηλότερης ποιότητας, ενώ η τιμή 100 στην υψηλότερη. |
| virtual [get_OperationName](./get_operationname/)() | Επιστρέφει το όνομα της λειτουργίας. |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | Λαμβάνει τη συλλογή των προστιθέμενων στόχων για την αποθήκευση των αποτελεσμάτων της λειτουργίας. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | Η κατηγορία Ποιότητα καθορίζει το επίπεδο συμπίεσης για μια εικόνα. Οι διαθέσιμες τιμές είναι από 0 έως 100. Όσο μικρότερος είναι ο αριθμός που καθορίζεται, τόσο μεγαλύτερη είναι η συμπίεση και, κατά συνέπεια, τόσο χαμηλότερη η ποιότητα της εικόνας. Η τιμή 0 οδηγεί στην εικόνα χαμηλότερης ποιότητας, ενώ η τιμή 100 στην υψηλότερη. |
## Δείτε επίσης

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
