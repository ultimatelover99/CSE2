//Emily Wilkinson
//Fouh CSE2
//9/7/15

//calc. cost of each item, sales tax for total cost,
//total cost of purchases before tax,
//total paid including tax

//define class
public class Arithmetic{
    
    public static void main (String[] args){
        
    //#socks,cost
    int nSocks = 3;
    double sockCost$ =2.58;
    
    //#glasses, cost
    int nGlasses = 6;
    double glassesCost$ =2.29;
    
    //#envelopes, cost
    int nEnvelopes = 1;
    double envelopesCost$ =3.25;
    
    //tax
    double taxPercent = 0.06;
    double socksTax, glassesTax, envelopesTax;
    
    //totals
    double totalSocksCost$, totalGlassesCost$, totalEnvelopesCost$;
    double totalTax, totalNoTax, total;
    
    totalSocksCost$ = nSocks*sockCost$*1.06;
    totalGlassesCost$ = nGlasses*glassesCost$*1.06;
    totalEnvelopesCost$ = nEnvelopes*envelopesCost$*1.06;
    total = totalSocksCost$+totalGlassesCost$+totalEnvelopesCost$;
    
    socksTax = nSocks*sockCost$*taxPercent;
    glassesTax = nGlasses*glassesCost$*taxPercent;
    envelopesTax = nEnvelopes*envelopesCost$*taxPercent;
    totalTax = socksTax+glassesTax+envelopesTax;
    
    double socksNoTax, glassesNoTax, envelopesNoTax;
    socksNoTax = nSocks*sockCost$;
    glassesNoTax = nGlasses*glassesCost$;
    envelopesNoTax = nEnvelopes*envelopesCost$;
    totalNoTax = socksNoTax+glassesNoTax+envelopesNoTax;
    
    double roundedTax = Math.round(totalTax*100.0)/100.0;
    double roundedTotal = Math.round(total*100.0)/100.0;
    
    System.out.println(nSocks+" socks were bought, at "+sockCost$+" per sock. "
    +socksTax+" was the tax. ");
    System.out.println(nGlasses+" glasses were bought, at "+glassesCost$+
    " per glass. "+glassesTax+" was the tax. ");
    System.out.println(nEnvelopes+" envelopes were bought, at "+envelopesCost$+
    " per envelope. "+envelopesTax+" was the tax. ");
    
    System.out.println("The cost before tax was "+totalNoTax);
    System.out.println("The total sales tax was "+roundedTax);
    System.out.println("The total cost including tax was "+roundedTotal);
    }//end main method
}//end class

