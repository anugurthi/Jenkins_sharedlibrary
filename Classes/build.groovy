def buildMycode()
{
bat label: '', script: 'mvn clean package'
}
def testCode()
{
bat label: '', script: 'mvn clean package'
}
return this;