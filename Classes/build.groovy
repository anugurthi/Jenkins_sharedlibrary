def buildMycode()
{
bat label: '', script: 'mvn package'
}
def cleanMycode()
{
bat label: '', script: 'mvn clean install'
}

def testCode()
{
bat label: '', script: 'mvn clean'
}
return this;
