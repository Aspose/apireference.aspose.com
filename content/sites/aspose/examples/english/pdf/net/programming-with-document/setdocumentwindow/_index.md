---
title: Set Document Window
linktitle: Set Document Window
second_title: Aspose.PDF for .NET API Reference
description: 
type: docs
weight: 290
url: /pdf/net/programming-with-document/setdocumentwindow/
---



```csharp

            
            // The path to the documents directory.
            string dataDir = "YOUR DOCUMENT DIRECTORY";

            // Open document
            Document pdfDocument = new Document(dataDir + "SetDocumentWindow.pdf");

            // Set different document properties
            // Sepcify to position document's window - Default: false
            pdfDocument.CenterWindow = true;
            
            // Predominant reading order; determins the position of page
            // When displayed side by side - Default: L2R
            pdfDocument.Direction = Direction.R2L;
            
            // Specify whether window's title bar should display document title
            // If false, title bar displays PDF file name - Default: false
            pdfDocument.DisplayDocTitle = true;
            
            // Specify whether to resize the document's window to fit the size of
            // First displayed page - Default: false
            pdfDocument.FitWindow = true;
            
            // Specify whether to hide menu bar of the viewer application - Default: false
            pdfDocument.HideMenubar = true;
            
            // Specify whether to hide tool bar of the viewer application - Default: false
            pdfDocument.HideToolBar = true;
            
            // Specify whether to hide UI elements like scroll bars
            // And leaving only the page contents displayed - Default: false
            pdfDocument.HideWindowUI = true;
            
            // Document's page mode. specify how to display document on exiting full-screen mode.
            pdfDocument.NonFullScreenPageMode = PageMode.UseOC;
            
            // Specify the page layout i.e. single page, one column
            pdfDocument.PageLayout = PageLayout.TwoColumnLeft;
            
            // Specify how the document should display when opened
            // I.e. show thumbnails, full-screen, show attachment panel
            pdfDocument.PageMode = PageMode.UseThumbs;

            dataDir = dataDir + "SetDocumentWindow_out.pdf";
            // Save updated PDF file
            pdfDocument.Save(dataDir);
            
             
        
```

