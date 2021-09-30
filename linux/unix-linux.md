# Environment Variables
Environment variables are values that are accessible in an entire working environment. In Unix, these values are set in the shell when it is started. For example, your home directory is an environment variable called `$HOME`. If you wish to see the value of a particular environment variable, you can use the `echo` command like so: `echo $HOME`.

To set your own environment variables, you can use the `export` command. For example, if you wanted to create an environment variable to store the password to your server, you could issue the following:
```
export SERVER_PASS=password
echo $SERVER_PASS
```

However, if you issue the above command into your console, when you close the shell and open it again, your environment will no longer be present. To keep these environment variables, you will have to place the command in one of your startup files, usually 
```
~/.bashrc
```

You can also remove environment variables with the `unset` command: 
```
unset SERVER_PASS
echo $SERVER_PASS
```


# Command-line Text Editors
You can write files in the shell by making use of built-in text editors such as `nano` and `vim` or `vi`.

## Guides
* [Beginner's Guide to Nano](https://www.howtogeek.com/howto/42980/the-beginners-guide-to-nano-the-linux-command-line-text-editor/)
* [Beginner's Guide to Vim](https://www.linux.com/training-tutorials/vim-101-beginners-guide-vim/)


# Package Managers
In Unix, if you wish to install software, you generally use a package manager. There are many package managers available and we will talk about a few.

## RPM
The Red Hat Package Manager or RPM is a package management system that manages `.rpm` files. It was created for Red Hat Linux but is used in many distributions.
## APT
Advanced Package Tool or APT is a package manager used on many Linux distributions. It allows you to retrieve, configure, and install/uninstall software packages.
## yum
The Yellowdog Updater, Modified or yum is a package-management utility for computers running RPM. When you create an EC2 using an Amazon Linux AMI, yum is installed.

As you are most likely to run into yum when you are working with Amazon linux, here are a few examples:
```
# update installed pacakges
sudo yum update
# Install git
sudo yum install git
# Uninstall git
sudo yum remove git
```
## dpkg
Debean Package is a low-level tool that manages `.deb` files. It was created for Debian and its derivatives.


# File Permissions
In Unix, file permissions can become very important. Every file in Unix has three types of permissions.
1. Owner permissions - What the owner of the file is allowed to do to the file.
2. Group permissions - What the group of users that the file belongs to is allowed to do to the file.
3. Other (world) permissions - What everyone else is allowed to do to the file.

Each type of permission can have any combination of read (`r` or `4`), write (`w` or `2`), and execute (`x` or `1`) permissions. You can represent these permissions as either a number or a string of characters. For example, someone with read and write permissions has `6` or `rw` permissions.

![Permissions table](permissions.png)

## Viewing permissions

You can see the permissions of files in a directory by using the `-l` flag on the `ls` command to get it to print the "long listing format"

`ls -l .`

## Changing permissions

You can change the permissions on a file using the `chmod` or change file mode bits command.

If you are using the numbers, it is as simple as specifying the correct permissions for the `owner`, `groups`, and `other` types and issuing the command targeting the file. For example, if I wished the owner to have read, write, and execute, groups to have read and execute, and other to have read permissions on `hello.text` I would issue the following command:

`chmod 754 hello.txt`

Otherwise, if you are using the strings, you have to specify which groups you are granting or revoking access to. Owner (u), group (g), and other (o) can be specified or all (a) can be used. The `+` indicates a granted privilege, `-` indicates a revoked privilege, and `=` allows you to set privileges.

Examples:
```
# Everyone has all permissions
chmod a+rwx hello.txt
# Revoke write access to other
chmod o-w hello.txt
# Set group access to be the same as other
chmod g=o hello.txt
```
